package BitManipulation_2;

public class EveryNumberOccerTwiceFindUniqueNumber {
    public static int funIdea1(int arr[]){
        int r=0;
        for(int i=0;i<arr.length;i++){
            r^=arr[i];

        }
        return r;

    }
    public static boolean check(int c, int j){

        int r=c&(1<<j);
        if(r==0){
            return false;
        }
        else {
            return true;
        }


    }
    public static int funIdea2(int arr[]) {
        int num=0;
        for(int i=0;i<32;i++){
            int cnt=0;
            for(int j=0;j<arr.length;j++){
                if(check(arr[j],i)){
                    cnt++;
                }
            }
            if((cnt&1)==1){
                num=num|(1<<i);
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,5,4,1,6,6};
        int s= funIdea2(arr);
        System.out.print(s);

    }
}
