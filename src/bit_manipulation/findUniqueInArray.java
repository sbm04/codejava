package bit_manipulation;

public class findUniqueInArray {
    public static int findUnique(int arr[]){
        int n=arr.length;
        int s=0;
        for(int i=0;i<n;i++){
            s=s^arr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[]={1,1,3,2,4,2,3};
        System.out.println(findUnique(arr));
    }
}
