package Practice;

public class CountingSubarraysEasy {
    public static int solveBrutForce(int arr[], int B){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                for(int start =i;start<=j;start++){
                    sum+=arr[start];
                }
                if(sum<B){
                    count++;
                }
            }
        }
        return count;
    }
    public static int solvePF(int[] arr, int B) {
        int n=arr.length;
        int pf[] = new int[n];
        pf[0]=arr[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                if(i==0){
                    sum+=pf[j];
                }
                else{
                    sum+=pf[j]-pf[i-1];
                }
                if(sum<B){
                    count++;
                }
            }
        }
        return count;

    }
    public static int solveCarryForword(int arr[], int B){
        int count=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum<B){
                    count++;
                }
            }
        }
        return count;

    }


    public static void main(String[] args) {
        int arr[] = {2, 5, 6};
        int s;
        s = solveBrutForce(arr,10);
        System.out.print(s);

    }
}
