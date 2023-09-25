package hashMapQustions;

import java.util.ArrayList;
import java.util.HashMap;

public class commonElement {
    public static int[] solve(int[] A, int[] B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = A.length;
        int m=A.length;
        ArrayList<Integer> al= new ArrayList<>();

        for (int i = 0; i < n; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }
        for(int i=0;i<m;i++){
            int a= B[i];
            if(hm.containsKey(a)){
                al.add(a);
                hm.put(a,hm.get(a)-1);
            }
        }
        if(al.size()==0){
            return new int[-1];
        }
        int arr[] = new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return arr;

    }
    public static void main(String[] args) {
        int A[]={8,15};
        int B[]={10};
        int ans[]=solve(A,B);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }

    }
}
