package code;

import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of test case : ");
        int t=sc.nextInt();
         for(int l=0; l<t;l++){
             System.out.println("Enter Number : ");
             int n= sc.nextInt();
             int count=0;
             for(int i=1;i<=n;i++){
                 if(n%i==0){
                     count++;
                 }
             }
             if(count==2){
                 System.out.println("Prime");
             }
             else{
                 System.out.println("Not prime");
             }
         }
    }
}
