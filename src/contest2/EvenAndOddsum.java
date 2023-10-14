package contest2;

public class EvenAndOddsum {
    public static int fun(int arr[]){
        int n=arr.length;
        int evenPSum[] = new int[n];
        int oddPSum[] = new int [n];
        evenPSum[0]=arr[0];
        oddPSum[0]=arr[0];
        for(int i=1;i<n;i++){
            if(i%2==0){
                oddPSum[i]=oddPSum[i-1];
                evenPSum[i]=arr[i] +evenPSum[i-1];

            }
            else{
                evenPSum[i]=evenPSum[i-1];
                oddPSum[i]=arr[i] +oddPSum[i-1];

            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            int evenSum=0;
            int oddSum=0;

             if(i==0){
                 evenSum=  oddPSum[n-1]-oddPSum[i];
                 oddSum= evenPSum[n-1]-evenPSum[i];


             }else{
                 evenSum= evenPSum[i-1] + oddPSum[n-1]-oddPSum[i];
                 oddSum=evenPSum[i-1] + evenPSum[n-1]-evenPSum[i];

             }
            if(evenSum==oddSum){
                count++;
            }

        }

        return count;

    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,6,-2};
        int s = fun(arr);
        System.out.print(s+ " ");


    }
}
