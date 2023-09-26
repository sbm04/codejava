package ArrayOneD;

public class QueriesQustion {
    public static int[] funBrute(int n,int q[][]){
        int ql= q.length;
        int ans[] = new int[n];
        for(int i=0;i<ql;i++){
            int index=q[i][0];
            int val=q[i][1];
            ans[index] += val;


        }
        for(int i=1;i<ans.length;i++){
            ans[i]+=ans[i-1];
        }
        return ans;

    }
    public static int[] funOptimise(int n,int B[][]){
        int ans[] = new int[n];
        for(int i=0;i<B.length;i++){
            int s=B[i][0];
            int e=B[i][1];
            int val=B[i][2];
            ans[s]+=val;
            if(e<n-1){
                ans[e+1]-=val;
            }



        }
        for(int i=1;i<ans.length;i++){
            ans[i]+=ans[i-1];
        }
        return ans;

    }
    public static void main(String[] args) {
         int q[][]={{1,3,2},
                    {2,5,3},
                    {5,6,-1}};
         int ans[] = funOptimise(7,q);
         for(int i =0;i<ans.length;i++){
             System.out.print(ans[i] + " ");
         }

    }
}
