package SearchingAndSortingAlgorithm;

public class BinarySearch {
    public static int binarySearch(int arr[] , int x){
        int s=0;
        int e=arr.length-1;
        int mid=0;
        while(s<e){
            mid=(s+e)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int x=binarySearch(arr,5);
        System.out.println(x);
    }
}
