package BitManipulation_2;

public class EveryNumberOccerThriceFindUniqueNumber {
    public static boolean check(int c, int j){

        int r=c&(1<<j);
        if(r==0){
            return false;
        }
        else {
            return true;
        }


    }
    public static int fun(int arr[]){
        int num=0;
        for(int i=0;i<32;i++){
            int cnt=0;
            for(int j=0;j<arr.length;j++){
                if(check(arr[j],i)){
                    cnt++;
                }
            }
            if(cnt%3==1){
                num=num|(1<<i);
            }
        }
        return num;

    }
    public static void main(String[] args) {
        int arr[] = {5,7,5,9,7,11,11,7,5,11};
        int s = fun(arr);
        System.out.print(s);
    }
}
