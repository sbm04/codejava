package Basic_Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class sorting_basic {
    public static void main(String[] args) {
        Integer arr[] = {3, 5, 1, -3};

        // Sort the array in descending order using a custom comparator
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // Reverse the order of comparison to get descending order
                return b.compareTo(a);
            }
        });

        // Now the array is sorted in descending order
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
