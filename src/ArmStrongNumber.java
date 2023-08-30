public class ArmStrongNumber {
    public static void main(String[] main){
        int number=37;
        int OriginalNumber=number;
        int reminder=0;
        int result=0;
        while(OriginalNumber!=0){
           reminder=OriginalNumber%10;
           result += (int) Math.pow(reminder,3);
           OriginalNumber=OriginalNumber/10;

        }
        if(result == number)
            System.out.println(number + " is an  .");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
