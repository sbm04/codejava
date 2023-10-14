package ArrayTwoD;

public class sprialMatrix {
    public static void fun(int A[][]){
        int n=A.length;
        int i=0;
        int j=0;
        while (n>1){
            for(int k=1;k<n;k++){
                System.out.print(A[i][j] +" ");
                j++;
            }

            for(int k=1;k<n;k++){
                System.out.print(A[i][j] +" ");
                i++;
            }

            for(int k=1;k<n;k++){
                System.out.print(A[i][j] +" ");
                j--;
            }

            for(int k=1;k<n;k++){
                System.out.print(A[i][j]+" ");
                i--;
            }
            i++;j++;
            n-=2;
        }
        if(n==1){
            System.out.print(A[i][j]+" ");
        }



    }
    public static void main(String[] args) {
        int a[][]={
                {1, 2, 3,4,5},
                {6,7,8,9,10},
                {11, 12, 13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}

        };
        fun(a);

    }
}
