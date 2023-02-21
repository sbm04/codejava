package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortMain {
    public static void main(String[] args) {
        ArrayList<Employees> al= new ArrayList<Employees>();
        al.add(new Employees(2,"Shubham",33000));
        al.add(new Employees(3,"Aman",34000));
        al.add(new Employees(1,"Rahul",35000));
        al.add(new Employees(6,"Atul",32000));
        System.out.println(al);
        Collections.sort(al,new IdComparator());
        System.out.println(al);
        ArrayList<Employees> emp1= new ArrayList<>(al);
        Collections.sort(emp1,new NameComparator());
        System.out.println(emp1);

    }
}
