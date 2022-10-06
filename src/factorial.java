public class factorial {
    public static int fact(int n){
        int result=0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n>1){
            result = n*fact(n-1) ;
        }
        return  result;
    }

  public static void main(String[] args){

      int n=5;
      System.out.println(fact(8));
  }
}
