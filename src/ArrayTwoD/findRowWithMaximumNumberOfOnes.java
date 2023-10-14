package ArrayTwoD;

public class findRowWithMaximumNumberOfOnes {
    public static int fun(int A[][]) {
        int n=A.length;
        int i=0;
        int j=n-1;
        int row=0;
        int maxOne=0;
        while(i<n && j>=0){
            if(A[i][j]==1){
                row=i;
                maxOne++;
                j--;
            }
            if(j>=0 && A[i][j]==0){
                i++;
            }
        }
        return row+1;

    }
    public static int funSecond (int A[][]) {
        int n=A.length;
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<n && j>=0){
            while(j>=0 && A[i][j]==1){
                j--;
                ans=i;
            }
            i++;
        }
        return ans+1;


    }
    public static void main(String[] args) {
        int a[][]={{0, 0, 0,0,1,1},
                {0, 0, 1,1,1,1},
                {0, 0, 0,0,0,1},
                {0, 0, 0,0,1,1},
                {0, 1, 1,1,1,1},
                {0, 0, 0,1,1,1}
                              };
        int s=funSecond(a);
        System.out.print(s);


    }
}
