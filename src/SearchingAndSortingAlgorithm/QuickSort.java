package SearchingAndSortingAlgorithm;

public class QuickSort {
    public static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static int partition(int l,int h,int arr[]){
        int pivot = arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
      swap(arr,j,l);
        return j;
    }
    public static void quicksort(int l,int h,int[] arr){
        if(l<h){
            int pivot = partition(l,h,arr);
            quicksort(l,pivot-1,arr);
            quicksort(pivot+1,h,arr);
        }
    }

    public static void main(String[] args) {

        int[] arr = {5,6,2,1,3,4,7};
        int l=0;
        int h=arr.length-1;
        quicksort(l,h,arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
