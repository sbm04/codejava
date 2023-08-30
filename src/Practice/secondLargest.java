package Practice;

import java.util.Scanner;

public class secondLargest {
    public static int fun(int a[]){
        int index=0;

        for(int i=0;i<a.length;i++){
            if(a[i]>a[index]){
                index=i;
            }
        }
        int ans=-1;

        for(int j=0;j<a.length;j++){
            if(a[j]!=a[index]){
                ans=Math.max(ans,a[j]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 3, 1};
        int s = fun(arr);
        System.out.print(s);
    }

}
