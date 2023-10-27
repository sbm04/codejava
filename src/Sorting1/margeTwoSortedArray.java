package Sorting1;

public class margeTwoSortedArray {
    public static int[] margeFun(int a[], int b[]){
        int aL=a.length;
        int bL=b.length;

        int ans[]= new int[aL+bL];
        int ai=0;
        int bi=0;
        int k=0;
        while(ai< aL && bi <bL){

             if(a[ai]<b[bi]){
                 ans[k]=a[ai];
                 k++;
                 ai++;
             }
             else {
                 ans[k]=b[bi];
                 k++;
                 bi++;
             }
        }

        while(ai<aL){
            ans[k]=a[ai];
            k++;
            ai++;
        }
        while(bi<bL) {
            ans[k]=b[bi];
            k++;
            bi++;
        }

         return ans;

    }
    public static void main(String[] args) {
        int a[] = {-5,-1,3,7,10,12,15};
        int b[]= {-4,0,2,8,9};
        int aL=a.length;
        int bL=b.length;
        int ans[]=margeFun(a, b);
        for(int i=0;i<aL+bL;i++){
            System.out.print(ans[i]+ " ");
        }

    }
}
