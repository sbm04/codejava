package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTry {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // constructor to build empty ArrayList
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        // ArrayList of capacity 100
        ArrayList<Integer> arr = new ArrayList<>(Collections.nCopies(10, 0));
        // ArrayList with 10 elements all equal to 0

        System.out.println(arr);

        // Add in ArrayList
        list1.add(100);
        list1.add(700);
        list1.add(800);
        list1.add(900);
        // Above function will add the the elements in the end of the list
        // Get in ArrayList or to access any Index
        int num = list1.get(0);
        // Add element in between in ArrayList
        list1.add(3,0);
        System.out.println(list1);

        // Set element in ArrayList
        list1.set(0,7);
        System.out.println("Set 0,7 " + list1);
        // Delete/Modify in ArrayList
        list1.remove(0);
        // size of ArrayList
        int sz = list1.size();
        // Contains in ArrayList
        System.out.println(list1.contains(200));
        // it will check whether the element present in the array or not
        // Sort ArrayList
        Collections.sort(list1);
        System.out.println("Sort " + list1);
        // It will sort the above List in the ascending order
        // clear the elements from ArrayList
        list1.clear();
        // It will clear all the elements of the ArrayList

    }
}
