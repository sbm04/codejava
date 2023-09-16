package Practice;

public class antiDiagonal {
    public static  int[][] fun(int arr[][]){
        int n=arr.length;
        int [][] ans= new int[2*n-1][n];
        for(int col=0;col<n;col++){
            int i=0;
            int j=col;
            while(i<n && j>=0){
                System.out.print(arr[i][j] + " ");
                ans[col][i]=arr[i][j];
                i++;
                j--;
            }
            System.out.println();
        }
        for(int col=1;col<n;col++){
            int i=col;
            int j=n-1;
            while(i<n && j>=0){
                System.out.print(arr[i][j] + " ");
                ans[n+col-1][n-j-1]=arr[i][j];
                i++;
                j--;
            }
            System.out.println();
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int ans[][]=fun(arr);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
