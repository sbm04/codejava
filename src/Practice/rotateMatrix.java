package Practice;

public class rotateMatrix {



        public static int[][] transpose(int A[][]) {
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

        public static void rev(int A[][]) {
            int row = A.length;
            int col = A[0].length;

            for (int i = 0; i < row; i++) {
                int s = 0;
                int e = col - 1;
                while (s < e) {
                    int temp = A[i][s];
                    A[i][s] = A[i][e];
                    A[i][e] = temp;
                    s++;
                    e--;
                }
            }
        }


    public static void main(String[] args) {
        /*int A[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};*/
        int A[][]={{1,2},
                {3,4}
        };
        A = transpose(A);
        rev(A);
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }

}
