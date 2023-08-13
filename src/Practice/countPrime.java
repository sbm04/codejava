package Practice;

import java.util.Scanner;

public class countPrime {
    public static int fun(int A, int B){
        int flag=0;
        int count=0;
        for (int i =A;i<B;i++){
            if(i==1 || i==0){
                continue;

            }
            flag=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
                System.out.println("Prime " + i);
            }

        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B=sc.nextInt();
        int c=fun(A,B);
        System.out.println("Count " + c);

    }
}
