package contest2.ArrayOneAdvance;

public class maximumSum {
    public static int fun(int arr[]){
        int n=arr.length;
        int sum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int s=i;s<=j;s++){
                    sum+=arr[s];
                }
                maxSum=Math.max(maxSum,sum);
                sum=0;
            }
        }
        return maxSum;

    }
    public static int funCarryForword(int arr[]){
        int n =arr.length;
        int maxSum =Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                //System.out.print(sum+ " ");
                maxSum=Math.max(maxSum,sum);
            }
            System.out.println();
        }
        return maxSum;
    }
    public static int kadanes(int arr[]){
        int n = arr.length;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int arr[] = {-3,4,6,8,-10,2,7};
        System.out.println(fun(arr));
        System.out.println(funCarryForword(arr));
        System.out.print(kadanes(arr));

    }
}
