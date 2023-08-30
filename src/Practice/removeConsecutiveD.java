package Practice;

public class removeConsecutiveD {
    public static String fun(String str){
        int n=str.length();
        char[] arr = new char[n];
        int i=1;
        int j=0;
        arr[0]=str.charAt(0);
        while(i<n){
            if(arr[j]!=str.charAt(i)){
                arr[j+1]=str.charAt(i);
                j++;
            }
            i++;
        }
        String nstr= new String(arr);
        String result = nstr.replaceAll("\\s", "");
        return result;




    }
    public static void main(String[] args) {
        String st1= new String();
        String st2="aabbss";
        st1=fun(st2);
        System.out.println(st1);

    }
}
