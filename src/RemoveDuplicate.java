import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        Arrays.sort(a);
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];


        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
    public static void main(String[] args){
//        int a[] = { 5,2,2,6,8,6,7,5,2,8};
//        int n = a.length;
//
//        n = removeduplicates(a, n);
//
//        // Printing The array elements
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");

        int a[] = {5,2,6,8,6,7,5,2,8};

        // Function call
        removeDuplicates(a);

    }
}
