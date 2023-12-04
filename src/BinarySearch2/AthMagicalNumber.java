package BinarySearch2;

public class AthMagicalNumber {
     public static  int getLCM(int a, int b) {
         int x = a;
         int y = b;
         while (y != 0) {
             int temp = y;
             y = x % y;
             x = temp;
         }
         int gcd = x;
         int lcm = (a * b) / gcd;
         //System.out.print(lcm);
         return lcm;
     }
     public static int fun(int A, int B,int C){
         int lo=B;
         int hi=A*Math.min(B,C);
         int lcm=getLCM(B,C);
         int ans=0;
         while(lo<=hi){
             int mid=lo+(hi-lo)/2;
             int f=(mid/B + mid/C)-(mid/lcm);
             if(f==A){
                 ans=mid;
                 hi=mid-1;

             }
             if(f<A){
                 lo=mid+1;
             }
             else{
                 hi=mid-1;
             }
         }
         return ans;
     }
    public static void main(String[] args) {

        int s= fun(4,5,7);
        System.out.print(s);


    }
}
