package Practice;

public class MinimumSwaps {
    public int solve(int[] A, int B) {
        int n = A.length;
        int windowSize = 0;
        //Find the window size , check numbers in array smaller than B & that will be window size
        for (int i = 0; i < n; i++) {
            if (A[i] <= B) {
                windowSize++;
            }
        }
        // Get the minimum swap count from first window
        // Find minimum
        int start = 0;
        int end = windowSize - 1;
        int minSwap = Integer.MAX_VALUE;
        int greaterThanB = 0;
        for(int i = start; i <= end; i++){
            // Find number of swaps required in first window
            if(A[i] > B)
                greaterThanB++;
        }
        minSwap = greaterThanB;
        start = 1;
        end = windowSize;
        // Element to be excluded if its already considered(Larger than B) then do –
        // Element to be included is larger than B then do ++
        while(end < n){
            if(A[start-1] > B)
                greaterThanB--;
            if(A[end] > B)
                greaterThanB++;
            minSwap = Math.min(greaterThanB, minSwap);
            start++;
            end++;
        }
        return minSwap;
    }
    public int solveE(int[] A, int B){
        int n=A.length;
        int fixed_size=0;// count the number of elements which is <=B
        for(int i=0;i<n;i++){
            if(A[i]<=B){
                fixed_size++;//This fixed_size variable will be our window.
            }
        }
        // edge case : for single element we do not need swaps so return 0
        if(fixed_size<=1){
            return 0;
        }
        // first window: from 0 to fixed_size-1
        // Will count how may elemets are >=B
        int numbersWhichNeedSwapping=0;
        for(int i=0;i<fixed_size;i++){
            if(A[i]>B){
                numbersWhichNeedSwapping++;
            }
        }
        int noOfSwap=numbersWhichNeedSwapping;
        // fixed_size window from 1 to n-1
        int i=1,j=fixed_size;
        while(j<n){
            if(A[i-1] <= B && A[j] > B){
                numbersWhichNeedSwapping++;
            }
            if(A[i-1] > B && A[j] <= B){
                numbersWhichNeedSwapping--;
            }
            noOfSwap=Math.min(noOfSwap,numbersWhichNeedSwapping);
            i++;
            j++;
        }
        return noOfSwap;

    }

    public static void main(String[] args) {

    }
}
