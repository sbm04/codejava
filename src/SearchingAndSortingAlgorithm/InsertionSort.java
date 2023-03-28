package SearchingAndSortingAlgorithm;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,6,2,1,3,4,7};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}


