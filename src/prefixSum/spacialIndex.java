package prefixSum;

public class spacialIndex {
    public static  int spclIndex(int A[]){

        int count=0;
        int i=0;

        int n=A.length;

        while(i<n){
            int es=0;
            int os=0;
            int index=0;

            for(int j=0;j<n;j++){
                if(i!=j){
                    if(index%2==0){
                        es+=A[j];
                    }
                    else{
                        os+=A[j];
                    }
                    if(os==es){
                        count++;
                    }
                    index++;
                }

            }

            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int A[] = {2,1,6,4};
        int c=spclIndex(A);
        System.out.print(c);

    }
}
