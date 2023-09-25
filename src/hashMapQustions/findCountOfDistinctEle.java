package hashMapQustions;

import javax.swing.*;
import java.util.HashSet;

public class findCountOfDistinctEle {
    public static int  fun(int arr[]){
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<n;i++){

            hs.add(arr[i]);

        }
        return hs.size();
    }
    public static void main(String[] args) {
        int arr[]= {3,5,6,5,4};
        int s= fun(arr);
        System.out.print(s);
    }
}
