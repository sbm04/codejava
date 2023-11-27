package Two_Pointer;

public class findThePair {
    public static boolean bSearch(int A[], int low, int high,
                                  int searchKey){

        while(low<=high){
            int m=low + (high-low)/2;
            if(A[m]==searchKey){
                return true;
            }
            else if(A[m]<searchKey){
                low=m+1;
            }
            else{
                high=m-1;
            }

        }
        return false;

    }
    public  static boolean funPairUsingBsearch(int A[], int K){
          for(int i=0;i<A.length;i++){
              int search = K-A[i];
              if(bSearch(A,i+1,A.length-1 , search)==true){
                  return true;
              }


          }
          return false;





    }
    public  static boolean funPair(int A[], int K){
        int i=0;
        int j=A.length-1;
        while(i<j){
            if(A[i]+A[j]==K){
                return true;
            }
            else if(A[i]+ A[j]<K){
                i++;
            }
            else{
                j--;
            }
        }
        return false;

    }
    public static void main(String[] args) {

        int arr[] = {-5,-2,1,8,10,12,15};

        int arr_size =arr.length;
//        if (funPairUsingBsearch(arr, arr_size))
//            System.out.println("Yes");
//        else
//            System.out.println("No");
        if(funPair(arr,arr_size)) {
            System.out.println("Yes");
        }
        else{
                System.out.println("No");
            }











    }
}
