package Practice;

public class pickfromBothSide {
    public static int fun(int []arr, int B){
        int curr_sum=0;
        int n=arr.length;
        for(int i=0;i<B;i++){
            curr_sum+=arr[i];
        }
        int maxSum=curr_sum;
        int inc=n-1;
        int exc=B-1;
        while(inc>=0 && exc>=0){

            curr_sum+=arr[inc--];
            curr_sum-=arr[exc--];
            maxSum=Math.max(maxSum,curr_sum);


        }
    return maxSum;

    }
    public static int fun1(int arr[] ,int B){
        int n=arr.length;
        int []pSum = new int[n];
        int []sSum= new int[n];
        pSum[0]=arr[0];

        for(int i=1;i<n;i++){
            pSum[i]=pSum[i-1] + arr[i];

        }
        sSum[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--){
            sSum[j]=sSum[j+1] +arr[j];
        }
        int maxSum= Math.max(pSum[B-1],sSum[n-B] );

        for(int i=1;i<B;i++){
            int sum=0;
            sum= pSum[i-1] + sSum[n-B+1];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-533,-666,-500,169,724,478,358,-38,-536,705,-855,281,-173,961,-509,-5,942,-173,436,
                -609,-396,902,-847,-708,-618,421,-284,718,895,447,726,-229,538,869,912,667,-701,35,894,
                -297,811,322,-667,673,-336,141,711,-747,-132,547,644,-338,-243,-963,-141,-277,741,529,-222,-684,35};
        //System.out.print(arr.length);

       int s= fun1(arr,48);
        System.out.print(s);

    }
}
