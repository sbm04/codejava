package Math3PrimeNumber;

public class CheckPrimeNumber {
    public static boolean check(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        if(count ==2){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        boolean s= check(7);
        System.out.print(s);

    }
}
