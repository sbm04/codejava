package hashMapQustions;

import java.util.HashMap;
import java.util.HashSet;

public class firstNonRepeatingEle {
    public static void fun(int arr[]){
        int n=arr.length;
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i]) +1 );

            }
            else{
                hm.put(arr[i],1 );
            }
        }
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])==1){
                System.out.print(arr[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,1,2,5};
        fun(arr);

    }
}
