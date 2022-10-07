import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc =new Scanner(System.in);
        int N= sc.nextInt();
        int a[] = new int[N];
        int sum=0;
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            sum = sum + a[i];

        }
        System.out.print(sum);

    }
}
