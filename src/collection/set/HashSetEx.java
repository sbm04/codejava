package collection.set;
import java.util.*;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Shubham ");
        hs.add("How ");
        hs.add("are ");
        hs.add("You ");
        hs.add("?");
        Iterator<String> it = hs.iterator();
         while(it.hasNext()){
             System.out.print(it.next());
         }
        // Creating HashSet and
        // adding elements
//        HashSet<String> hs = new HashSet<String>();
//
//        hs.add("Geeks");
//        hs.add("For");
//        hs.add("Geeks");
//        hs.add("Is");
//        hs.add("Very helpful");
//
//        // Traversing elements
//        Iterator<String> itr = hs.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }


    }
}
