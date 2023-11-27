package HashingProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctElementInEveryWindows {
    public static ArrayList<Integer> fun(int arr[], int k){

        ArrayList<Integer> al=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<=n-k;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<k;j++){
                hs.add(arr[i+j]);
            }
            al.add(hs.size());
        }
       return al;
    }


    public static ArrayList<Integer> fun1(int arr[], int k){
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }

        }
        al.add(hm.size());
        int s=1,e=k;
        while(e<n){
            hm.put(arr[s-1],hm.get(arr[s-1])-1);
            if(hm.get(arr[s-1])==0){
                hm.remove(arr[s-1]);
            }
            if(hm.containsKey(arr[e])){
                hm.put(arr[e],hm.get(arr[e])+1);

            }
            else{
                hm.put(arr[e],1);
            }
            al.add(hm.size());
            s++;
            e++;
        }

        return al;

    }


            public ArrayList<Integer> dNums(ArrayList<Integer> arr, int k) {
                int n=arr.size();
                ArrayList<Integer> al=new ArrayList<>();
                HashMap<Integer,Integer> hm = new HashMap<>();
                for(int i=0;i<n;i++){
                    if(hm.containsKey(arr.get(i))){
                        hm.put(arr.get(i),hm.get(arr.get(i))+1);
                    }
                    else{
                        hm.put(arr.get(i),1);
                    }

                }
                al.add(hm.size());
                int s=1,e=k;
                while(e<n){
                    hm.put(arr.get(s-1),hm.get(arr.get(s-1))-1);
                    if(hm.get(arr.get(s-1))==0){
                        hm.remove(arr.get(s-1));
                    }
                    if(hm.containsKey(arr.get(e))){
                        hm.put(arr.get(e),hm.get(arr.get(e))+1);

                    }
                    else{
                        hm.put(arr.get(e),1);
                    }
                    al.add(hm.size());
                    s++;
                    e++;
                }

                return al;
            }


    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,2,3};
        ArrayList<Integer> al=fun(arr,4);
        for(Integer a:al){
            System.out.print(a+" ");
        }


    }
}
