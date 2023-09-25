package interviewPrblm;

public class countConjucativeOnes {
    public static int fun(int arr[]){
        int n=arr.length;
        int totalAns=0;
        int ans=0;
        for(int i=0;i<n;i++){

            if(arr[i]==1){
                totalAns++;
            }
            else{
                int l=0;
                int r=0;
                int j=i-1;
                while(j>=0 && arr[j]==1){
                    l++;
                    j--;
                }
                j=i+1;
                while(j<n && arr[j]==1){
                    r++;
                    j++;
                }
                ans=Math.max(ans,l+r+1);
            }
        }
        if(ans==0){
            return totalAns;
        }else{
            return ans;
        }


    }
    public  static  int funSolve(String A){
        int n=A.length();
        int totalans=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='1'){
                totalans++;
            }
            else{
                int j=i-1;
                int l=0;
                int r=0;
                while(j>=0 && A.charAt(j)=='1'){
                    j--;
                    l++;

                }
                j=i+1;
                while(j<n && A.charAt(j)=='1'){
                    j++;
                    r++;

                }
                ans=Math.max(ans,l+r+1);
            }

        }
        if(ans==0){
            return totalans;
        }else{
            return ans;
        }

    }
    public static void main(String[] args) {
        int arr[] ={0,1,1,1,0,1,1,0,1,1,0};

        int s= fun(arr);
        System.out.println(s);
        String str="01110110110";
        int sStr=funSolve(str);
        System.out.print(sStr);



    }
}
