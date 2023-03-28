package SearchingAndSortingAlgorithm;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            int min=arr[i];
             for(int j=i+1;j<n;j++){
                 if(min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                 }
             }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,2,1,3,4,7};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

