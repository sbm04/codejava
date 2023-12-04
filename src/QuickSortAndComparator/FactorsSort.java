package QuickSortAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByFactor implements Comparator<Integer> {
    public static int factor(int A){
        int count=0;
        for(int i=1;i<=A;i++){
            if(A%i==0){
                count++;
            }
        }
        return count;

    }

    @Override
    public int compare(Integer o1, Integer o2) {
          if(factor(o1)==factor(o2)){
              if(o1<o2){
                  return -1;
              }
              else if(o1>o2){
                  return 1;
              }
              else{
                  return 0;
              }
          } else if (factor(o1)<factor(o2)) {
              return -1;

          }else{
              return 1;
          }
    }
}

public class FactorsSort {


    public static void main(String[] args) {
        Integer[] arr = {9, 3, 10, 6, 4};
        List<Integer> list = Arrays.asList(arr); // Use parameterized List<Integer>
        Collections.sort(list, new SortByFactor());
        System.out.println("Sorted array based on factors: " + list);

    }
}
