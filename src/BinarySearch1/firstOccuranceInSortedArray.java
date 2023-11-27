package BinarySearch1;

public class firstOccuranceInSortedArray {
    public static int fun(int arr[] ,int k) {
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid= lo + (hi-lo)/2;
            if(arr[mid]==k){
                ans=mid;
                hi=mid-1;
            }
            else if(arr[mid]<k){
                lo=mid+1;
            }
            else{
                hi= mid-1;
            }
        }

        return ans;
    }
    public static int funLast(int arr[] ,int k) {
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid= lo + (hi-lo)/2;
            if(arr[mid]==k){
                ans=mid;
                lo=mid+1;
            }
            else if(arr[mid]<k){
                lo=mid+1;
            }
            else{
                hi= mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] ={-5,-5,-3,0,0,1,1,5,5,5,5,5,5,5,8,10,10,15,15};
        int s= funLast(arr,5);
        System.out.print(s);
    }
}
