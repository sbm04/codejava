package Practice;

public class stkprb {
    public static int fun(int arr[]){
        int n = arr.length;
        if(n==0){
            return 0;
        }
        int minnum=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<n;i++){
            if(arr[i]<minnum){
                minnum=arr[i];
            }
          max_profit=Math.max(max_profit,arr[i]-minnum);


        }
        return max_profit;



    }
    public static void main(String[] args) {
        int arr[] = {2,1};
        int s=fun(arr);
        System.out.print(s);
    }
}
