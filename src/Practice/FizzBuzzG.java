package Practice;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzG {
    public static List<String> fizzBuzzArray(int A) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int A = 20;
        List<String> resultArray = fizzBuzzArray(A);
        System.out.println(resultArray);
    }
}
