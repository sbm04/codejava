package contest2.prefixSum;

public class countPair {
    public static int fun(String A){
        int carry=0;
        int current=0;
        for(int i=0;i<A.length();i++){

            if(A.charAt(i)=='a'){
                current+=1;
            } else if (A.charAt(i)=='g') {
                carry+=current;
            }
        }
        return carry;


    }
    public static void main(String[] args) {
        String s= "abegag";
        int v= fun(s);
        System.out.print(v+" ");

    }
}
