package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class notGreaterEle {
    public static ArrayList<Integer> fun(ArrayList<Integer> A){
        int n=A.size();
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i<n;i++){
            int IElement = A.get(i);
            boolean flag=true;
            for(int j=i+1;j<n;j++){
                int curr_Ele=A.get(j);
                if(IElement >=curr_Ele){

                }
                else{
                    flag=false;

                }
            }
            if (flag){
                A.add(A.get(i));
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));
        ArrayList<Integer> s=fun(a);
        System.out.print(s);
    }
}
