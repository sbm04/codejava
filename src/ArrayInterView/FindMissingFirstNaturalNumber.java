package ArrayInterView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMissingFirstNaturalNumber {
    public static  int firstMissingPositive(ArrayList<Integer> A){
        int n =A.size();
        for(int i=0;i<n;i++){
            while(A.get(i)> 0 && A.get(i)<=n && A.get(i)!=i+1){
                int pos= A.get(i) -1;
                int ele= A.get(i);

                if (A.get(i) == A.get(ele -1)){
                    break;
                }
                Collections.swap(A,i,ele-1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (A.get(i) != i + 1) {
                return i + 1;
            }
        }

        return n + 1;



    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 2, 7, 6, 9, 1, 8, 3));

        int s= firstMissingPositive(arr);
        System.out.print(s);
    }

}
