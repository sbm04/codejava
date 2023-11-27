package BinarySearch1;

public class SortedArraySearchKthElement {
    public static int fun(int arr[] ,int k){
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==k){
                return mid;

            } else if (arr[mid]<k) {
                s=mid+1;
            }
            else{
                e=mid-1;
            }


        }
        return -1;
    }
    public static void main(String[] args) {
            int arr[] ={3,6,9,12,14,19,20,23,25,27};
            int s= fun(arr,12);
            System.out.print(s);
    }
}
