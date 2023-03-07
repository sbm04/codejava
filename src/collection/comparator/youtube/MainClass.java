package collection.comparator.youtube;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class MainClass {
    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        ls.add(new Student(23,"Ram"));
        ls.add(new Student(35,"Shyam"));
        ls.add(new Student(83,"Aman"));
        ls.add(new Student(13,"Ram"));
        ls.add(new Student(13,"Anuj"));
        //Collections.sort(ls,new SortByNameThenMarks());
        /*Collections.sort(ls,new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getName().equals(o2.getName())){
                    return o1.getMark()-o2.getMark();
                }
                else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });*/
        /*Collections.sort(ls,
            ( o1,  o2) ->{
                if(o1.getName().equals(o2.getName())){
                    return o1.getMark()-o2.getMark();
                }
                else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        );*/
        //Collections.sort(ls, ( o1,  o2) ->o1.getName().compareTo(o2.getName()));
        Collections.sort(ls,Comparator.comparing(Student::getName).thenComparing(Student::getMark).reversed());

        ls.forEach(System.out::println);
    }
}
 class SortByNameThenMarks implements Comparator<Student> {
   /*  Return positive number o1> 02 agar decreasing order me sort karna hai to.
     Return negative number o2> 01 .
     Agar o1 == 02 both are equal.*/
     @Override
     public int compare(Student o1, Student o2) {
         if(o1.getName().equals(o2.getName())){
             return o1.getMark()-o2.getMark();
         }
         else{
             return o1.getName().compareTo(o2.getName());
         }
     }
 }

