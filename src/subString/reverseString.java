package subString;

public class reverseString {
    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        char[] input = s.toCharArray();
        int n = input.length;

        // Reverse the entire string
        reverse(input, 0, n - 1);

        /*// Reverse each word
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (input[end] == ' ') {
                reverse(input, start, end - 1);
                start = end + 1;
            }
        }

        // Reverse the last word (or the only word if there's no space)
        reverse(input, start, n - 1);*/

        // Convert the char array back to a string
        return new String(input).trim();
    }
    public static void main(String[] args) {
        String input = "  Hello  World  ";
        String reversed = reverseWords(input);
        System.out.println(reversed); // Output: "World Hello"

    }
}






