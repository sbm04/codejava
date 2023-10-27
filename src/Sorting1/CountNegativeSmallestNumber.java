package Sorting1;

public class CountNegativeSmallestNumber {
    public static void main(String[] args) {

        int arr[] = {-2,3,8,3,-2,3};
        int n = arr.length;
        int minN=Integer.MAX_VALUE;
        int maxN=Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
             minN=Math.min(minN,arr[i]);
             maxN=Math.max(maxN,arr[i]);
        }
        int range= maxN-(minN)+1;
        //System.out.print("Rang" + range);
        //System.out.print(" " + minN + " " + maxN);

        int fre[] = new int[range];
        int ans[] = new int[10];
        for(int i=0;i<n;i++){
            fre[arr[i]-(minN)]++;
        }
        for(int i=0;i<range;i++){
            System.out.print(fre[i]+" ");
        }
        System.out.println();
        int k=0;
        for(int i =0;i<range;i++){

            for(int j=0;j<fre[i];j++){
                ans[k]=i + minN;
                k++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
