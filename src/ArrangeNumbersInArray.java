public class ArrangeNumbersInArray {
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        int val=1;
        int s=0;
        int e=n-1;
        while(s<e){
            arr[s]= val++;
            arr[e]= val++;
            s++;
            e--;
        }
        if(s==e)
            arr[e]=val;
    }
}
