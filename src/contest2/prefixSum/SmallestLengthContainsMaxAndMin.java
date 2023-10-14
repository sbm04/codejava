package contest2.prefixSum;

public class SmallestLengthContainsMaxAndMin {
    public static  int fun(int arr[] ){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int lastMinIdx=-1;
        int lastMaxIdx=-1;
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                if(lastMaxIdx!=-1){
                   ans=Math.min(ans,i-lastMaxIdx+1);
                }
                lastMinIdx=i;
            }
            else{
                if(arr[i]==max){
                    if(lastMinIdx!=-1){
                        ans=Math.min(ans,i-lastMinIdx+1);
                    }
                    lastMaxIdx=i;
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,6,4,5,1,5,2,6,4,1};
        int s=fun(arr);
        System.out.print(s);
    }
}
