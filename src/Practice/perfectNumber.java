package Practice;

public class perfectNumber {
    public static int solve(int A) {
        int sum=1;
        for(int i=2;i*i<=A;i++){
            if(A%i==0){

                sum+=i;
                System.out.print("i-> "+ i + " sum -> " + sum);
                if(i*i!=A){

                    sum+=A/i;
                    System.out.println(" i*i-> "+ i*i + " A/i->"+ A/i +  " "  +" sum -> " + sum);

                }
            }

        }
        if(sum==A ){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
       int i=  solve(28);
       System.out.println("ans "+i);
    }
}
