package HashingProblems;

import java.util.HashSet;

public class PairSum {
    public static int[] PairSum(int arr[],int x){
        int n=arr.length;
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j]==x){
                    // System.out.println(arr[i] + arr[j] + " x  "+ x);
                    ans[0]=arr[i];
                    ans[1]=arr[j];


                }
            }
        }
        return ans ;


    }
    //Using HashSet
    public static Boolean PairSumHashSet(int arr[], int x){
        int n=arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            int other= x-arr[i];
            if(hs.contains(other)){
                return true;
            }
            hs.add(arr[i]);

        }
        return false;
    }
    public static void main(String[] args) {

        int arr[] = {5,7,9,2,3};
        //int ans[]=PairSum(arr,8);

//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i] + " ");
//        }
        boolean b= PairSumHashSet(arr,4);
        System.out.print(b);


    }
}
