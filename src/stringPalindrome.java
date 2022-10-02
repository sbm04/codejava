import java.util.Locale;

public class stringPalindrome {
    public static void main(String[] args){
        String str="Level";
        String revStr = "";
        for(int i=(str.length()-1);i>=0;--i){
            revStr= revStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(revStr.toLowerCase())){
            System.out.println(" Palindrome ");
        }
        else{
            System.out.println(" Not Palindrome ");
        }
    }
}
