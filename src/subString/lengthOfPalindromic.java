package subString;

public class lengthOfPalindromic {
    public static boolean isPalindromic(String str,int r,int l){
        int len=0;
        int s=r;
        int e=l;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            else{
                s++;
                e--;
            }

        }
        return true;
    }
    public static int palindromicLength(String s){
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindromic(s,i,j)){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String str="feacabacabgf";
        int n=palindromicLength(str);
        System.out.print(n);


    }
}
