package Practice;

public class Equilibrium {
    public static int equilFun(int[] a){
        int n=a.length;
        int i,j;
        int lsum,rsum;

        for(i=0;i<n;i++){

            lsum=0;
            for(j=0;j<i;j++){
                lsum+=a[j];

            }
            rsum=0;
            for(j=i+1;j<n;j++){
                rsum+=a[j];

            }
            if(lsum==rsum){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int s=equilFun(arr);
        System.out.print(s);

    }
}
