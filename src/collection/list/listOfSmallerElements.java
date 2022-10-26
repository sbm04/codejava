package collection.list;

import java.util.ArrayList;
import java.util.List;

public class listOfSmallerElements {
    public static ArrayList<Integer> getSmaller(ArrayList<Integer>arr, int k)
    {
        //Your code here
        // ArrayList<Integer> al = new ArrayList<Integer>();
        // Iterator<Integer> it = arr.iterator();
        // while(it.hasNext()){
        //   int x = (Integer) it.next();
        //     if(x < k)
        //     {
        //         al.add(x);
        //     }

        // }
        // return al;
        List<Integer> a= arr.stream().filter(i->i<k).collect(java.util.stream.Collectors.toList());

        ArrayList<Integer> b=new ArrayList<>(a);

        return b;
    }

}
