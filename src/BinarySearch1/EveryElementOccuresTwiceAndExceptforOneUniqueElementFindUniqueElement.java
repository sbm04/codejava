package BinarySearch1;

public class EveryElementOccuresTwiceAndExceptforOneUniqueElementFindUniqueElement {
    public static int funXor(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++ ){
            ans=ans^arr[i];
        }
        return ans;
    }
    public static int funBinarySearch(int arr[]){
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        if(n==1){
            return arr[0];
        }
        if(arr[0]!= arr[1]){
            return arr[0];
        }
        if(arr[n-2]!=arr[n-1]){
            return arr[n-1];
        }
        //{3,3,1,1,8,8,10,10,19,6,6,2,2,4,4};
        while(lo<=hi){
            int mid=lo + (hi-lo)/2;

            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid]== arr[mid-1]){
                mid=mid-1;
            }
            if(mid%2==0){
                lo=mid+2;
            }
            else{
                hi=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={3,3,1,1,8,8,10,10,19,6,6,2,2,4,4};
        int s= funBinarySearch(arr);

        System.out.print(s);
    }
}
