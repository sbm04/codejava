package subString;

public class longestPalindrome {
    public static String maxString(String a, String b)
    {
        if(a.length()>=b.length())
            return a;
        else return b;
    }
    public static String funPalindrome(String s,int l,int r){
        int n=s.length();
        int left=l;
        int right=r;
        while(left>=0 && right<n){
            if(s.charAt(left)!=s.charAt(right)){
                break;
            }
            left--;
            right++;

        }
        return s.substring(left+1,right);

    }
    public static String longestPaildrome(String A){
        int n=A.length();
        int left,right;
        String ans="";
        String evenL;
        String oddL;
        String temp;
        for(int i=0;i<n;i++){
            //Even length
            evenL=funPalindrome(A,i,i+1);
            ans=maxString(ans,evenL);
            //Odd Length
            oddL=funPalindrome(A,i,i);
            ans=maxString(ans,oddL);

        }
        return ans;

    }
    public static void main(String[] args) {

        String s= "adaebcdfdcbetggte";
        String ntr=longestPaildrome(s);
        System.out.print(ntr);

    }
}
