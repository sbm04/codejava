package Recursion;

public class fibonacci {
    public static int fibo(int A){
        if (A==0 || A==1){
            return A;
        }
        return fibo(A-1) + fibo(A-2);
    }
    public static void main(String[] args) {
        int n=7;
        int s =fibo(n);
        System.out.print(fibo(n));


    }
}
