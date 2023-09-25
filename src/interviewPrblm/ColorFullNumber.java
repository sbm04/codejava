package interviewPrblm;

import java.util.HashSet;
import java.util.Set;

public class ColorFullNumber {
    public static int fun(int a){

        int temp=a;
        int count=0;
        Set<Integer> st= new HashSet<>();
        while(temp!=0){
            temp/=10;
            count++;
        }
        int n=a;
        int arr[]= new int[count];
        int k=0;
        for(int i=count-1;i>=0;--i){
            int d= (int) Math.pow(10,i);
            int ele=n/d;
            n%=d;
            arr[k++]=ele;
        }
        int []pf= new int[count];
        pf[0]=arr[0];
        for(int i=1;i<arr.length;i++){
           pf[i]=pf[i-1] * arr[i];
        }
        for(int s=0;s<pf.length;s++) {

            for(int e=s;e<pf.length;e++){
                if(s==0){
                    //System.out.println(pf[e]);
                    st.add(pf[e]);
                }
                else{
                    int p=pf[e]/pf[s-1];
                   // System.out.println(p);
                    if(st.contains(p)){
                        return -1;
                    }
                    else{
                        st.add(p);
                    }

                }
            }

        }
        return 1;

    }

    public static void main(String[] args) {
        int n=3245;
        int s= fun(236);
       System.out.print(s);

    }
}
