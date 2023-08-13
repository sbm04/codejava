package Practice;

public class StringStartAndEnd {
    public static int fun(String s){
        int sub=0;
        int i;
        for(i =0;i<s.length();i++){
            if(s.charAt(i)==' ' ){
                if(s.charAt(i+1)=='a'){
                    int j=i+1;
                    while(s.charAt(j)!=' '){
                      j++;
                    }
                    int c=--j;
                    if(s.charAt(c)=='a'){
                        sub++;
                        i=++j;
                    }

                }


            }
        }
        return sub;

    }

    public static int fun1(String s) {
        int sub = 0;
        int i = 0; // Initialize loop index
        //fghj aera aio aara asa
        while (i < s.length() - 1) { // Use '<' instead of '<=' to avoid index out of bounds
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == 'a') {
                int j = i + 1;
                while (j < s.length() && s.charAt(j) != ' ') {
                    j++;
                }
                if (j < s.length() && s.charAt(j - 1) == 'a') { // Check index validity
                    sub++;
                    i = j; // Move the loop index to j
                } else {
                    i = j + 1; // Move the loop index past the found substring
                }
            } else {
                i++;
            }
        }
        return sub;
    }

    public static int fun2(String s){
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(j) == 'a') {
                        count++;

                    }
                }
            }
        }

        return count;
    }
    public static int fun3(String s){
        int m = 0; // Count of 1's in input string
        int n=s.length();
        // Traverse input string and count of 1's in it
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a')
                m++;
        }

        // Return count of possible pairs among m 1's
        return m * (m - 1) / 2;
    }




    public static void main(String[] args) {
      int c=fun2("fghjauiaua");
      System.out.println(c);
        int c1=fun3("fghjauiaua");
        System.out.println(c1);
    }
}
