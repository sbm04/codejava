package Practice;

public class RotateMatrixSimple {

    public static void main(String[] args) {
        int A[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int n=A.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int ele= A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=ele;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int ele=A[i][n-j-1];
                A[i][n-j-1]=A[i][j];
                A[i][j]=ele;
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }



    }
}
