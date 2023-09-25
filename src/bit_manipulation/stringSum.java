package bit_manipulation;

public class stringSum {
    public static  String addBinary(String A, String B) {
        int al=A.length()-1;
        int bl=B.length()-1;
        int pos=1;
        int c=0;

        StringBuilder an=new StringBuilder();
        while(al>=0 || bl>=0){
            int a = (al >= 0) ? A.charAt(al) - '0' : 0;
            int b = (bl >= 0) ? B.charAt(bl) - '0' : 0;
            int s= a+b+c;
            c=s/2;
            s%=2;
            an.insert(0,s);
            al--;
            bl--;

        }
        System.out.println();
        if(c!=0){
            an.insert(0,c);
        }

        return an.toString();

    }
    public static String addBinary1(String A, String B) {
        int al = A.length() - 1;
        int bl = B.length() - 1;
        int c = 0;
        StringBuilder an = new StringBuilder();

        while (al >= 0 || bl >= 0) {
            int a = (al >= 0) ? A.charAt(al) - '0' : 0;
            int b = (bl >= 0) ? B.charAt(bl) - '0' : 0;
            int sum = a + b + c;
            c = sum / 2;
            an.insert(0, sum % 2);
            al--;
            bl--;
        }

        if (c != 0) {
            an.insert(0, c);
        }

        return an.toString();
    }
    public static String addBinary2(String A, String B){
        int nA=A.length();
        int nB=B.length();
        int ml=Math.max(nA,nB);
        int i,j,k;
        i=nA-1;
        j=nB-1;
        k=ml;
        char[]res=new char[ml+1];
        int c=0;
        int sum=0;
        while(i>=0 || j>=0 || c!=0){
            sum=c;
            if(i>=0){
                sum+=A.charAt(i)-'0';

            }
            if(j>=0){
                sum+=B.charAt(j)-'0';
            }
            res[k]=(char)((sum%2)+'0');
            c=sum/2;
            i--;
            j--;
            k--;

        }
        if (res[0] == '1')
            return new String(res);
        int len = Math.max(nA, nB);
        return new String(res, 1, len);

    }

    public static void main(String[] args) {
        String a="100";
        String b="10";
        String s=addBinary2(a,b);
        System.out.print(s);



    }
}
