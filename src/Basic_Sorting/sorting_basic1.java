package Basic_Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class sorting_basic1 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, -3};
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Sort the boxed array in descending order using a custom comparator
        Arrays.sort(boxedArray, Comparator.reverseOrder());

        // Now the boxed array is sorted in descending order
        for (int num : boxedArray) {
            System.out.print(num + " ");
        }
    }
}
