package Math3PrimeNumber;

public class PrintAllPrimeNumer1ToNOptimized {
    public static int[] setAllPrime(int n){
        int p[]=new int[n+1];
        for(int i=2;i<=n;i++){
            if(p[i]==0){
                for(int j=2*i;j<=n;j=j+i){
                  p[j]=1;
                }
            }
        }
        return p;
    }
    public static int[] setAllPrimeOpt(int n){
        int p[] = new int[n+1];
        for(int i=2;i*i<=n;i++){
            if(p[i]==0){
                for(int j=i*i;j<=n;j=j+i){
                    p[j]=1;
                }
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int n=20;
        int arr[]=setAllPrimeOpt(n);
        for(int i=2;i<=n;i++){

            if(arr[i]==0){
                System.out.print(i + " ");
            }
        }
    }
}
