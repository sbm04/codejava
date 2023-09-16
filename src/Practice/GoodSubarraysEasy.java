package Practice;

public class GoodSubarraysEasy {
    public static int subBf(int arr[],int B){
        int n=arr.length;
        int goodSubArray=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                int subArrayLength=0;
                for(int start=i;start<=j;start++){
                    sum+=arr[start];
                    subArrayLength++;
                }
                if(subArrayLength%2==0 && sum<B){
                    goodSubArray++;
                } else if (subArrayLength%2!=0 && sum>B ) {
                    goodSubArray++;
                }
            }
        }
        return goodSubArray;

    }
    public static int subPrefixSum(int arr[],int B){
        int n=arr.length;
        int goodSubArray=0;
        int pf[] = new int[n];
        pf[0]=arr[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.println(" i -> "+ i);

            for(int j=i;j<n;j++) {
                int sum=0;
                int size=0;
                int sz = j - i + 1;

                if(i==0){
                    sum+=pf[j];
                }
                else{
                    sum+=pf[j]-pf[i-1];
                }
                size=j+i+1;
                System.out.println(" i -> "+ i +" j -> "+ j+" sum -> "+ sum +" size-> " +size+"             sz->"+ sz);
                if(size%2==0 && sum<B){
                    goodSubArray++;
                } else if (size%2!=0 && sum>B ) {
                    goodSubArray++;
                }

            }
        }

        return goodSubArray;


    }
    public static int subCarryForward(int []arr,int B) {
        int n = arr.length;
        int goodSubArray = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (((i + j + 1) % 2 == 0 && sum < B) || (i + j + 1) % 2 != 0 && sum > B) {
                    goodSubArray++;
                }
            }
        }
        return goodSubArray;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int B=4;
        int s= subCarryForward(arr,B);
        System.out.print(s);
    }
}
