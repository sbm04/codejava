package subString;

public class lengthOfPalindromicOptimize {
    public static void main(String[] args) {
        String s= "adaebcdfdcbetggte";
        int n=s.length();
        int maxlen=0;
        for(int c=0;c<s.length();c++){
            //odd len string
            int left=c;
            int right=c;
            while(left>=0 && right<n){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                left--;
                right++;

            }
            maxlen=Math.max(maxlen,right-left-1);

            //Even len string

            left=c;
            right=c+1;
            while (left>=0 && right<n){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                left--;
                right++;

            }
            maxlen=Math.max(maxlen,right-left-1);
        }
        System.out.print(maxlen);

    }
}
