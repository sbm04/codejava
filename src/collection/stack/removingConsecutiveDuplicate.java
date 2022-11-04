package collection.stack;
import java.util.*;

public class removingConsecutiveDuplicate {
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here

        //Stack<Character> st = new Stack<Character>();
        // String s="";
        // s += str.charAt(0);

        // for(int i=0;i<str.length();i++){
        //     char x = str.charAt(i);
        //     if(!st.isEmpty() && st.peek()!=x){
        //         s+=x;
        //     }
        //     st.push(x);

        // }
        // return s;
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(st.empty()){
                st.push(str.charAt(i));
            }
            else if(st.peek()==str.charAt(i)){
                continue;
            }
            else{
                st.push(str.charAt(i));
            }

        }
        String s="";
        while(!st.empty()){
            s+=st.peek();
            st.pop();
        }
        String reverse = new StringBuffer(s).reverse().toString();
        return reverse;


    }
}
