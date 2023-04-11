public class cn_propbability {
    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int ncr(int n, int r) {
        int ans = (fact(n) / fact(n - r)) / fact(r);
        return ans;
    }

    public static int probability(int n, int x) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int ans = ncr(4, x) * ncr(4, n - x);
        float fans = ans * 1.0f / ncr(8, n);
        return (int) (fans * 100);


    }

    public static void main(String[] args) {

    }
}
