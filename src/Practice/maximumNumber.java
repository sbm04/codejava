package Practice;

import java.util.ArrayList;

public class maximumNumber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(15);
        al.add(100);
        al.add(101);
        al.add(110);
        al.add(190);
        al.add(120);
        int max= Integer.MIN_VALUE;
        for (int i=0;i<al.size();i++){
            if (max< al.get(i)){
                max= al.get(i);
            }
        }
        System.out.print(max);
    }
}
