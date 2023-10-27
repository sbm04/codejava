package Sorting1;

public class mergeSort {
    public static void merge(int a[],int  s, int m,int e){
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


    }
    public static void mergeSort(int a[], int s,int e){
        if(s==e){
            return;
        }
        int m = (s+e)/2;
        mergeSort(a,s,m);
        mergeSort(a,m+1,e);
        merge(a,s,m,e);


    }
    public static void main(String[] args) {
        int a[] = {-5,-1,3,7,10,12,15};
        mergeSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }


    }
}
