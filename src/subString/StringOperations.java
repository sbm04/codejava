package subString;

public class StringOperations {
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
    public static void fun(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                str=charRemoveAt(str,i);
                n--;
                i--;


            }
        }
        String nstr="";
        nstr+=str+str;
        for(int i=0;i<n;i++){
            if(nstr.charAt(i)=='a'|| nstr.charAt(i)=='i'||nstr.charAt(i)=='o'||nstr.charAt(i)=='u'||nstr.charAt(i)=='e'){
                nstr=nstr.replace(nstr.charAt(i),'#');
            }

        }
        System.out.println(nstr);





    }
    public static String funOpt(String str){
        int n=str.length();
        StringBuilder res= new StringBuilder();
        for(int i=0;i<n;i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                    res.append('#');
                }
                else{
                    res.append(str.charAt(i));
                }

            }

        }
        res.append(res);
        return res.toString();

    }

    public static void main(String[] args) {
        String str="aeiOUz";
       // fun(str);
        String s=funOpt(str);
        System.out.print(s);






    }
}
