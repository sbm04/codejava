package subString;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static  String fun(String[] str){
        int n=str.length;

        int minLength=Integer.MAX_VALUE;
        for(String s:str){
            minLength=Math.min(minLength,s.length());
        }
        StringBuilder st= new StringBuilder();

        for(int i=0;i<minLength;i++){
            char currentChar = str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                  if(str[j].charAt(i)!=currentChar){
                      return st.toString();
                  }
            }
            st.append(currentChar);

        }
        //System.out.print(minLength);
        return st.toString();

    }
    public static  String funArrayList(ArrayList<String > strs){
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<strs.size();i++){
            minLength=Math.min(minLength,strs.get(i).length());
        }
        StringBuilder st= new StringBuilder();
        for(int i=0;i<minLength;i++){
            char curr=strs.get(0).charAt(i);
            for(int j=1;j<strs.size();j++){
                if(strs.get(j).charAt(i)!=curr){
                    return st.toString();
                }
            }
            st.append(curr);
        }
        //System.out.print(st);
        return st.toString();

    }
    public static void main(String[] args) {
       /* String[] A= {"flower", "flow", "flight"};
        String st= fun(A);
        System.out.print(st);*/
        ArrayList<String> B= new ArrayList<>(Arrays.asList("flower", "flow", "flight"));
        String nst= funArrayList(B);
        System.out.print(nst);



    }
}
