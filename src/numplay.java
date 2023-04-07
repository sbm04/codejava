public class numplay {
    public static int maxnumber(int n, int k)
    {

        for (int j = 0; j < k; j++) {
            int ans = 0;
            int i = 1;
            while (n / i > 0) {
                System.out.print("n "+ n + " i " +i );
                int temp = (n / (i * 10))
                        * i
                        + (n % i);
                i *= 10;
                System.out.println(" temp "+ temp);

                ans = Math.max(ans, temp);
            }
            n = ans;
        }


        return n;
    }
    public static void main(String[] args) {
       int ans= maxnumber(5438,1);
       System.out.print(ans);
    }
}
