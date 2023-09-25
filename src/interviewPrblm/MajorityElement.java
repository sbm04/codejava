package interviewPrblm;

import java.util.HashMap;

public class MajorityElement {
    public static int fun(int arr[]){
        int n=arr.length;
        float nRV=Math.round(n/2+1);
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            int ele=arr[i];
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        for(int i=0;i<n;i++){
            int ele=arr[i];
            if(hm.get(ele)==nRV){
                return ele;
            }
        }
        return -1;

    }
    public static int funOpt(int arr[]){
        int count1=0;
        int count2=0;
        int first =Integer.MAX_VALUE;
        int second=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(first==arr[i]){
                count1++;
            } else if (second==arr[i]) {
                count2++;
            } else if (count1==0) {
                first=arr[i];
                count1++;
            }
            else if(count2==0){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(first==arr[i]){
                count1++;
            }
            else if(second==arr[i]){
                count2++;
            }
        }
        float nvr=Math.round(n/3);
        if(count1>nvr){
            return first;
        }
        if(count2>nvr){
            return second;
        }
        return -1;



    }
    public static void main(String[] args) {
        int arr[] ={3,4,3,6,1,3,2,5,3,3,3};

        int  s= fun(arr);
        System.out.print(s);
    }
}
