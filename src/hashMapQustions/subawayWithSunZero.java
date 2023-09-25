package hashMapQustions;

import java.util.HashMap;
import java.util.HashSet;

public class subawayWithSunZero {
    public static boolean fun(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int sum=0;
            sum+=arr[i];
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    System.out.println(" i " + i + " j " + j);
                    //return true;
                }
            }


        }

        return false;
    }

    public static boolean fun1(int arr[]){
        int n=arr.length;
        int pf[]= new int[n];
        pf[0]=arr[0];
        int count=0;

        for(int i=1;i<n;i++){
            pf[i]=pf[i-1] +arr[i];
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            if(pf[i]==0){
                return true;
            }
            hs.add(pf[i]);
        }
        if(hs.size()==pf.length){
            return false;
        }
        else{
            return true;
        }

    }
    public static int solve(int[] A) {
        HashMap<Long,Integer> map=new HashMap<>();
        map.put(0L,1);
        int ans=0;
        long prfSum=0;
        for(int i=0;i<A.length;i++){
            prfSum+=A[i];
            if(map.containsKey(prfSum)){
                ans+=map.get(prfSum);
            }
            map.put(prfSum,map.getOrDefault(prfSum,0)+1);
        }
        return ans%1000000007;
    }
    public int solve1(int[] A) {
        long count=0;
        int mod=1000000007;
        HashMap<Long,Integer> map=new HashMap<>();
        long []ps=new long[A.length];
        ps[0]=A[0];
        if(ps[0]==0){//checking that first element is 0
            count++;
        }
        for(int i=1;i<A.length;i++){
            ps[i]=(A[i]+ps[i-1]%mod)%mod; //only do % mod when doing prefix bcz chances of out of flow is only here
            if(ps[i]==0){//checking every element after first elemet
                count++;
            }
        }
        //by this line prefix sum is ready

        for(int i=0;i<ps.length;i++){
            if(map.containsKey(ps[i])){
                count=count+map.get(ps[i]); //if we found any value of the key more than once then we add that val with count
                map.put(ps[i],map.get(ps[i])+1);  //then increase its frequency
            }
            else{
                map.put(ps[i],1);  //first time occurance
            }
        }
        return (int)count;
    }
    public static void main(String[] args) {
        int [] arr= {-1,8,-4,7,-4,0,-8,-2,-7};  //[-1,8,-4,7,-4,0,-8,-2,-7]
        boolean ans= fun1(arr);
        System.out.print(ans);

    }
}
