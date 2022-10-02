public class integerPalindrome {
    public static void main(String[] args) {
    int s=232,temp=s;
    int rev=0;
    int rem=0;
    while(s>0){
        rem=(s%10);
        rev=(rev*10)+rem;
        s=s/10;
    }
    if(rev==temp){
        System.out.println(" Palindrom ");
    }
    else{
        System.out.println(" Not Palindrom ");
    }
    }
}
