public class sortZeroOne {
    public static void main(String[] args) {
        //Your code goes here
        int arr[]={1, 1 ,0 ,0, 1,0, 0,0,0,0, 1 };
        //Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]!=0&& arr[r]==0){
                arr[l]=0;
                arr[r]=1;
                l++;
                r--;


            }
            else if(arr[l]==1 && arr[r]==1){
                r--;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
