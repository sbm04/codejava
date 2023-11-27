package BinarySearch1;

public class GivenAnIncreasingDecreasingArrayWithDistintElementFindMaximunElement {
    public static int funBS(int arr[]){
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        if(n==1){
            return arr[0];
        }
        if(arr[0]> arr[1]){
            return arr[0];
        }
        if(arr[n-1] >= arr[n-2]){
            return arr[n-1];
        }
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(arr[mid] > arr[mid - 1] && arr[mid]> arr[mid+1] ){
                return arr[mid];

            }
            if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1] ){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5};
        int s= funBS(arr);
        System.out.print(s);

    }
}
