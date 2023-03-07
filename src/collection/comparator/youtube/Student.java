package collection.comparator.youtube;

public class Student  implements  Comparable<Student>{
    private int mark;
    private String name;

    public Student(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }
    @Override
    public int compareTo(Student o) {

        //Increasing Order
        //current object bara hai to return karna hai 1
        //current object chota hai to return karna hai -1
        if(this.mark> o.mark){
            return 1;
        }
        else if(this.mark< o.mark) {
            return -1;
        }

        return this.name.compareTo(o.name);
        /*
            //dece order
            // positive hai to current object chota hai
            // negative hai to cur
            // rent object bara hai.
        if(this.mark> o.mark){
            return -1;
        }
        else if(this.mark< o.mark) {
            return 1;
        }

        return this.name.compareTo(o.name);
        // one line
        //return this.mark - o.mark;
        */
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", name='" + name + '\'' +
                '}';
    }


}
