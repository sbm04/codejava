public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here
        int n=str.length();
        char[] arr = new char[n];

        arr[0]=str.charAt(0);
        int i=1;
        int j=0;
        while(i<n){
            if(arr[j]!=str.charAt(i)){
                arr[j+1]=str.charAt(i);
                j++;
            }
            i++;
        }
        String string = new String(arr);
        String result = string.replaceAll("\\s", "");

        return result;

    }
    public static void main(String[] args) {
        String st1= new String();
        String st2="aabbss";
        st1=removeConsecutiveDuplicates(st2);
        System.out.println(st1);
    }
}
