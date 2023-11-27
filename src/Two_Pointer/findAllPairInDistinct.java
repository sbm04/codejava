package Two_Pointer;

import java.util.HashMap;
import java.util.Map;

public class findAllPairInDistinct  {
    public static int funPairCount(int A[],int K){
        int n =A.length;
        int i=0;
        int j=n-1;
        int count=0;
        while(i<j){
            if(A[i] + A[j] ==K){
                count++;
                i++;
                j--;
            }
            else if(A[i] + A[j]<K){
                i++;
            }
            else{
                j--;
            }
        }
        return count;


    }
    public static int funPairCountDublicate(int A[] ,int K){
        int n=A.length;
        HashMap<Integer , Integer> HMap= new HashMap<>();
        for(int i=0;i<A.length;i++){
            HMap.put(A[i],HMap.getOrDefault(A[i],0)+1);
        }
        int arr[]= new int[HMap.size()];
        int k=0;
        for(Map.Entry<Integer , Integer> eMap : HMap.entrySet()){
            System.out.println(eMap.getKey() + "  " + eMap.getValue());
            arr[k++]=eMap.getKey();

        }
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(i<=j){

            if(arr[i]+ arr[j]==K){
//                System.out.println("  W ");
//                System.out.println( " I " +HMap.get(arr[i]) + " J "+HMap.get(arr[j]));
                int s=HMap.get(arr[i])*HMap.get(arr[j]);
                count+=s;
                i++;j--;

            }
            else if(A[i] + A[j]<K){
                i++;
            }
            else{
                j--;
            }
        }
        return count;


    }

    public static void main(String[] args) {
        int arr[] = {2,3,3,4,4,9,9,10,10,10,15};
//        int s= funPairCount(arr,10);
//        System.out.print(s);

       int s= funPairCountDublicate(

               arr,13);
        System.out.print(s);
    }
}
