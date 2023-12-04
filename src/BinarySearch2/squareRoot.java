package BinarySearch2;

public class squareRoot {
    public static int fun(int N){
        int lo=0;
        int hi=N;
        if(N<=1){
            return N;
        }
        while(lo<=hi){
            int mid=lo+ (hi-lo)/2;
            if(mid*mid==N){
                return mid;
            }
            if(mid*mid<N){
                lo=mid+1;

            }
            else{
                hi=mid-1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {


        int s= fun(9);
        System.out.print(s);

    }
}
