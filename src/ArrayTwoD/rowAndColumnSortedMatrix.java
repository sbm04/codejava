package ArrayTwoD;

public class rowAndColumnSortedMatrix {
    public static boolean fun(int A[][],int k){
        int n=A.length;
        int m=A[0].length;
        int i=0;
        int j=m-1;

        while(i<n && j>=0){
            if(A[i][j]==k){
                System.out.println(" Find "+i+ " " + j);
                return true;
            } else if (A[i][j]<k) {
                System.out.println(i+ " " + j);
                i++;
            }
            else{
                System.out.println(i+ " " + j);
                j--;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        int a[][]={{1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}};
       boolean b= fun(a,8);
       System.out.print(b);

    }
}
