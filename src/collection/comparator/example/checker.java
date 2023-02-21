package collection.comparator.example;

import java.util.Comparator;

class checker implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa() != s2.getCgpa()) {
            return (int) (s2.getCgpa() - s1.getCgpa());
        }
        if (s1.getCgpa() == s2.getCgpa()) {
            return s1.getFname().compareTo(s2.getFname());
        }
        if (s1.getFname() == s2.getFname()) {
            return s1.getId() - s2.getId();
        }
        return s1.getId() - s2.getId();
    }
}
