package Practice;

public class genrateSubArrays {

        public static int[][] generateSubarrays(int[] A) {
            int n = A.length;
            int totalSubarrays = n * (n + 1) / 2; // Total number of subarrays

            int[][] result = new int[totalSubarrays][];
            int index = 0;

            for (int start = 0; start < n; start++) {
                System.out.println(" Start " + start);
                for (int end = start; end < n; end++) {

                    int subarraySize = end - start + 1;
                    System.out.print("index-> "+ index + " SubArray -> "+ subarraySize+" S-> " + start + " End->"+ end);
                    result[index] = new int[subarraySize];

                    for (int i = start, subIndex = 0; i <= end; i++, subIndex++) {
                        System.out.print(" A[i] -> "+ A[i]);
                        result[index][subIndex] = A[i];
                    }
                    System.out.println();

                    index++;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] A = {1, 2, 3};
            int[][] subarrays = generateSubarrays(A);

            // Print the subarrays
            for (int[] subarray : subarrays) {
                for (int num : subarray) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }



}
