package BitManipulation_2;

public class SubArraysOr {
    public class Solution {
        public int solve(int[] A) {
            long n = A.length;
            int mod=1000000007;
            long ans = 0;
           //Initialize total number of sub arrays.
            long totalSubArray = (n * (n+1)) / 2;
            for(int i=0;i<32;i++){
                long zero = 0;
            //Initialize total number of sub arrays.
                long total = totalSubArray;
                for(int j=0;j<n;j++){
            //whenever we meet unset bit we increase zero count.
                    if(((A[j]>>i)&1)==0){
                        zero++;
                    }else{
            // we meet 1 we reduce the subarrays from total count.
                        long zeroCount = (zero * (zero+1))/2;
                        total -= zeroCount;
                        zero = 0;
                    }
                }

            // If last bit is zero means it will not reduce in above condition
            // so, we do have additional check here.
                if(zero != 0){
                    long zeroCount = (zero * (zero+1))/2;
                    total -= zeroCount;
                }
            // if totalSubArray is same as total means we had not found any unset.
            // in 32 bits integer we may have many unset bits.
            //e.g 0 0 0 0 0 0 0 0 0 1 ans so on.
                if(total != totalSubArray){
                    long pow=1<<i;
                    ans = (ans + (pow * total)%mod)%mod;
                }
            }

            return (int)ans%mod;
        }
    }
}
