package collection.comparator.example;
import java.util.*;

    public class sortHacker {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            checker checker = new checker();
            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);

                testCases--;
            }
            Collections.sort(studentList,checker);
            for(Student st: studentList){
                System.out.println(st.getFname());
            }
        }


        }
