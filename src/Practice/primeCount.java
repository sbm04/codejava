package Practice;

public class primeCount {
    public static int solve(int A) {
        int count=0;
        for(int i=2;i<=A;i++){
            boolean flag=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag=false;

                }

            }
            if(flag){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int c=solve(19);

        System.out.print(c);

    }
}
