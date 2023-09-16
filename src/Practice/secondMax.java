package Practice;

public class secondMax {
    public static  int fun1(int arr[]){
        int n=arr.length;
        int fmax=Integer.MIN_VALUE;
        int smax=0;
        for(int i=0;i<n;i++){
            if(arr[i]>fmax){
                smax=fmax;
                fmax=arr[i];
            }
            else if( arr[i]<fmax && arr[i]>smax ){
                          smax=arr[i];
            }
        }
        if (smax == Integer.MIN_VALUE) {
                   return -1;
        }
        return smax;
    }
     public static  int fun2(int[] arr){
        int indx=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]> arr[indx]) {
                indx=i;
            }
        }
        int ans=-1;
        for(int i=0;i<n;i++ )  {
            if(arr[i]!=arr[indx]){
                ans=Math.max(ans,arr[i]);
            }
        }
        return ans;
     }
    public static void main(String[] args) {
        int a[] ={2, 1, 2 };
        System.out.print(fun2(a));

    }
}
