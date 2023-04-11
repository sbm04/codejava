package bit_manipulation;

public class findTwoUniqueElementInArray {
    public static void fun(int arr[]){
        int XxorY=0;
        for(int val:arr){
            XxorY=XxorY^val;
        }
        int rsbm=XxorY & -XxorY;
        int x=0;
        int y=0;
        for(int val:arr){
            //And karne se jiska bit off hai  nikal jaye ga
            if((val&rsbm)==0){
                x=x^val;
            }
            else{
                y=y^val;
            }
        }
        if(x<y){
            System.out.println("X " +x);
            System.out.println("Y "+y);
        }
        else {
            System.out.println("Y "+y);
            System.out.println("X "+x);

        }

    }
    public static void main(String[] args) {
        int arr[] ={36,50,24,56,36,24,42,50};
        fun(arr);

    }

}
