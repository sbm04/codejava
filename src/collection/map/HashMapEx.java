package collection.map;
import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
//        HashMap<Integer,String> hm = new HashMap<>();
//        hm.put(1,"Sohan");
//        hm.put(2,"Ram");
//        hm.put(3,"Rohit");
//        hm.put(4,"Rahul");
//        System.out.println("Value for 1 is " + hm.get(1));
//        for (Map.Entry<Integer, String> e : hm.entrySet())
//            System.out.println(e.getKey() + " " + e.getValue());


        // Creating HashMap and
        // adding elements
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
