package Practice;

import java.util.Scanner;

public class fizzBuzz {
    public static void fun(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0 & arr[i]%5==0 ){
                System.out.println(" FizzBuzz");
            }

            else if(arr[i]%5==0){
                System.out.println(" Buzz");
            }
            else if(arr[i]%3==0){
                System.out.println(" Fizz ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        fun(arr);
    }
}
