package IntroductiontoProblemSolving;

public class countFactor {
    public static int solve(int A) {
        if (A==1){
            return 0;
        }
        for(int i=2;i*i<A;i++){
            if(A%i==0){
                return 0;
            }
        }
        return 1;

    }
    public static void main(String[] args) {
        int n=solve(4);



    }

}
