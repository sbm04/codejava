package Sorting1;

public class smallestNumber {
    public static void main(String[] args) {

        int arr[] = {6,3,4,2,7,2,1};
        int n = arr.length;
        int fre[] = new int[10];
        int ans[] = new int[10];
        for(int i=0;i<n;i++){
            fre[arr[i]]++;
        }
        int k=0;
        for(int i =0;i<10;i++){

            for(int j=0;j<fre[i];j++){
                ans[k]=i;
                k++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
