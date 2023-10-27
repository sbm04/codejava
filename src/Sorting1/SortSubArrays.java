package Sorting1;

public class SortSubArrays {
    public static int[] sortSubArrayFun(int a[],int  s, int m,int e){
        int p1=s;
        int p2=m+1;


        int ans[]= new int[e-s+1];

        int k=0;
        while(p1<=m && p2 <=e){

            if(a[p1]<a[p2]){
                ans[k]=a[p1];
                k++;
                p1++;
            }
            else {
                ans[k]=a[p2];
                k++;
                p2++;
            }
        }

        while(p1<=m){
            ans[k]=a[p1];
            k++;
            p1++;
        }
        while(p2<=e) {
            ans[k]=a[p2];
            k++;
            p2++;
        }
        int j=0;
        for(int i=s;i<=e;i++){
            a[i]=ans[j++];
        }
       return a;

    }
    public static void main(String[] args) {
        int a[] = {4,8,-1,2,6,9,11,3,4,7,13,0};

        int aL=a.length;

        int ans[]=sortSubArrayFun(a,2,6,9);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }

    }
}
