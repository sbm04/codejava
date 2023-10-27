package Recursion;

public class factorial {
    public static int fact(int A){
       if(A==0){
           return 1;
       }
       return  fact(A-1)* A;
    }
    public static void main(String[] args) {
        int n=5;
        int s=fact(5);
        System.out.print(s);
    }
}
