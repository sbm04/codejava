package ArrayOneD;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOne {
    public static ArrayList<Integer>  fun(ArrayList<Integer> A){

        int n = A.size();
        if (n == 0) {

            return new ArrayList<>();
        }
        long p = (long) Math.pow(10, n - 1);
        //System.out.println("p " + p);
        long m = p;
        long number = 0;
        for (int i = 0; i < n; i++) {
            number += A.get(i) * m;
            m /= 10;
        }
        number += 1;
        System.out.println(number);

        long temp = number;
        long temp1 = number;
        int countNum = 0;
        while (temp1 != 0) {
            countNum++;
            temp1 /= 10;
        }
        // System.out.println("count "+countNum);
        ArrayList<Long> ans = new ArrayList<>();

        if (countNum == 0) {
            ans.add(1L);
        } else {
            long ms = (long) Math.pow(10, countNum - 1);

                for (int i = 0; i < countNum; i++) {
                    if(ms!=0){
                        long ele = temp / ms;
                        temp %= ms;
                        ms /= 10;
                        ans.add(ele);
                    }

                }



        }
        ArrayList<Integer> intList = new ArrayList<>();

        for (Long longValue : ans) {
            intList.add(longValue.intValue());
        }
        return intList;


    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 5));
        ArrayList<Integer> b=fun(A);
        for(long a:b){
            System.out.print(a+" ");
        }
    }
}
