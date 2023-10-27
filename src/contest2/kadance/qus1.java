package contest2.kadance;

public class qus1 {
    public static int fun(int arr[]){
        int n=arr.length;
        int globalSum=arr[0];
        int currSum=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                currSum+=arr[i];
//                System.out.println(" < " + currSum+ " ");
            }
            else{
                currSum=arr[i];
//                System.out.println(" > " + currSum+ " ");
            }
            globalSum=Math.max(globalSum,currSum);
        }


         return globalSum;

    }
    public static void main(String[] args) {
        int arr[] = {9,2,4,2};
        int s= fun(arr);
        System.out.print(s);

    }
}
