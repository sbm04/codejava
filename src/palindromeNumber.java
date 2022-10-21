public class palindromeNumber {
    public static void main(String[] args) {
        int nu=454;
        int sum=0;
        int temp=nu;
        int rev=0;
        while(nu>0){
            rev= nu%10;
            sum=(sum*10) +rev;

            nu=nu/10;
        }
        if(sum==temp){
            System.out.print("Palindrom");
        }
        else{

            System.out.print(" Not Palindrom");
        }
    }
}
