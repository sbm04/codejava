package ArrayOneD;

public class MaxSumSubArrays {
    public static int funBrute(int arr[]){
        int n=arr.length;
        int maxSum=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                   sum+=arr[k];
                   System.out.print(arr[k] +" ");
                }
                System.out.println();
                maxSum=Math.max(maxSum,sum);
                sum=0;
            }
        }
        return maxSum;

    }
    public static int funBrute1(int arr[]) {
        int n=arr.length;
        int maxSum=0;
        for(int i=0;i<n;i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];

                }
                if(sum>maxSum){
                    maxSum=sum;
                }
                sum=0;

            }

        }
        return maxSum;

    }
    public static int funCarryForward(int arr[]){
        int n=arr.length;
        int maxSum=0;
        for(int i=0;i<n;i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum+=arr[j];
                //System.out.print("  arr[j] "+ arr[j] +" ");
                //System.out.print(" Max -> " + maxSum);
                maxSum=Math.max(maxSum,sum);

            }

            System.out.println();

        }
        return maxSum;

    }
    public static int kadanesAlgo(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
            int arr[] = {-2,3,4,-1,5,-10,7};
            int ans=funCarryForward(arr);
            System.out.print("Max->"+ans);
    }
}
