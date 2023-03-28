package SearchingAndSortingAlgorithm;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,6,2,1,3,4,7};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
