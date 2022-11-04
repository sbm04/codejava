package collection.stack;
import java.util.*;
public class removingConsecutiveDuplicate2 {
    public static String removePair(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (!s.isEmpty() && s.peek() == str.charAt(i)) {
                s.pop();
            } else {
                s.push(str.charAt(i));
            }
        }
        StringBuilder strb = new StringBuilder();
        String res = "";
        while (!s.isEmpty()) {
            res += s.pop();
        }
        return strb.append(res).reverse().toString();
    }
}
