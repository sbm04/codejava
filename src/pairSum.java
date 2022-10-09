public class pairSum {
    public static int pairSum(int arr[], int x) {
        //Your code goes here
        int numOfPair=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    numOfPair+=1;
                }
            }
        }
        return numOfPair;
    }
}
