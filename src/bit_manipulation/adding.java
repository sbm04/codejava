package bit_manipulation;

public class adding {
    public static void main(String[] args) {
        int a= 368;
        int b=453;
        int c=0;
        int ans=0;
        int pos=1;
        while(a!=0 && b!=0){

            int ela=a%10;
            a/=10;
            int elb=b%10;
            b/=10;
            int s=ela+elb+c;
            //System.out.print(" s " + s);
            c=s/10;
            s%=10;

           // System.out.print(" c " + c + " s/10 " + s/10);
            ans=ans + (s*pos);
           // System.out.println(" ans " + ans);
            pos*=10;


        }
        System.out.println(ans);
    }
}
