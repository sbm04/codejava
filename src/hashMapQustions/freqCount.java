package hashMapQustions;

import java.util.HashMap;
import java.util.Map;

public class freqCount {
    public static void fun(int [] arr){
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
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey()+ " -> "+ entry.getValue());

        }

    }
    public static void main(String[] args) {
        int arr[] ={2,6,3,8,2,8,2,3,8,10,6};
        fun(arr);
    }
}
