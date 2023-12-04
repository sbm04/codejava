package QuickSortAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber  {
    public static String fun (ArrayList<Integer> A){
        Collections.sort(A,new Comparator<Integer>(){


            @Override
            public int compare(Integer o1, Integer o2) {
                String first= Integer.toString(o1) + Integer.toString(o2);
                String second= Integer.toString(o2) + Integer.toString(o1);

               return -first.compareTo(second);
            }
        });
        StringBuilder st =new StringBuilder();
        for(int i=0;i<A.size();i++){
            st.append(A.get(i));

        }
        if(A.get(0)==0){
            return "0";
        }
        return st.toString();




    }
    public static void main(String[] args) {
       // A = [3, 30, 34, 5, 9]
      //  Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));

         String st= fun(A);
         System.out.print(st);

    }


}
