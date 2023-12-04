package BinarySearch2;

public class SearchElementInRotatedArray {
    public static int fun(int A[],int K){
        int n=A.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(A[mid]==K){
                return mid;
            }
            if(K<A[0]){
                //part 2
                if(A[mid]>A[0]){ //low ko part 2 me lana hai

                    lo=mid+1;
                }
                else{
                    if(A[mid]<K){
                       lo=mid+1;
                    }
                    else{
                        hi=mid-1;
                    }

                }


            }
            else{
                //part 2
                if(A[mid]<A[0]){
                    hi=mid-1;
                }
                else{
                    if(A[mid]<K){
                        lo=mid+1;
                    }
                    else{
                        hi=mid-1;
                    }
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={10,20,30,1,2,3,4,5,6,7,8,9};
        int s= fun(arr,20);
        System.out.print(s);

    }
}
