package Practice;

import com.sun.tools.javac.Main;

import javax.swing.plaf.synth.SynthStyleFactory;
import java.lang.reflect.Array;
import java.util.Scanner;

public class primeOrNot {
    public static void fun(int [] arr,int n){
        int flag=0;
        for(int i=0;i<n;i++){
            int p=arr[i];

              flag=0;
            for(int j=2;j<p/2;j++){
                if(p%j==0){

                    flag=1;
                    break;

                }


            }
            if(flag==0){
                System.out.println("Prime Number "+ p);
            }
            else{
                System.out.println("Not Prime Number "+ p);
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
        fun(arr,n);

    }
}
