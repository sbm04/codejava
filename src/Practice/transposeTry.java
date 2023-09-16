package Practice;

public class transposeTry {
     public static int[][] transpose1(int A[][]) {
         int row = A.length;
         int col = A[0].length;
         int[][] ans = new int[col][row];
         for (int i = 0; i < col; i++) {
             for (int j = 0; j < row; j++) {
                 ans[i][j] = A[j][i];
             }
         }
         return ans;
     }
    public static int[][] transpose2(int A[][]) {
        int n=A.length;
        int m=A[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int ele =A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=ele;

            }
        }
        return A;
    }

    public static void main(String[] args) {
      /*int A[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};*/
        int A[][]={{1,2},
                {3,4}
        };
        A=transpose1(A);
        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
