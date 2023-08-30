package Practice;

import java.util.HashSet;
import java.util.Set;

public class SumOfSubArray {
    public static int fun(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i =0 ;i<n-1;i++){
            int sum=arr[i];
            if(sum==0){
                count++;
            }
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    count++;
                }
            }
        }
        return count++;

    }
    public static int fun1(int arr[]){
        Set<Integer> hs = new HashSet<Integer>();


        int sum = 0;

        int count=0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                count++;

            // Add sum to hash set
            hs.add(sum);
        }

        // We reach here only when there is
        // no subarray with 0 sum
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int c= fun1(arr);
        System.out.println(c);


    }
}
