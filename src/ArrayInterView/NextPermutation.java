package ArrayInterView;

public class NextPermutation {
    public static void funswap(int []arr, int s, int e){
        System.out.println("s "+ s + " e " + e);
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }

    }

    public static void fun(int []arr){
        int n=arr.length;
        int b=0;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                b=arr[i];
                ind=i;
                break;

            }
        }
        System.out.println("B  " + b + "  ind  " + ind);

        int result = -1;
        int resultindx=-1;
        int target=b;

        for (int i=ind;i<n;i++) {
            if (arr[i]> target && (result == -1 || arr[i] < result)) {
                result = arr[i];
                resultindx=i;
            }
        }
        System.out.println("Result " + result+ "  resultInd  " + resultindx);
        int temp=arr[ind];
        arr[ind]=arr[resultindx];
        arr[resultindx]=temp;
        funswap(arr,ind+1,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3}; //1,5,8,4,7, 6, 5,3,1
        fun(arr);
    }
}
