package QuickSortAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DistanceBetweenTwoPoint {
    public static int[][] fun(int  arr[][] ,int B){
        int n=arr.length;
        Integer mat[][]  = new Integer[n][2];
        for(int i=0;i<n;i++){
            mat[i][0]=arr[i][0];
            mat[i][1]=arr[i][1];

        }
        Arrays.sort(mat, new Comparator<Integer []>() {

            @Override
            public int compare(Integer[]o1, Integer[] o2) {
                double dist1=distance(o1);
                double dist2=distance(o2);
                if(dist1<dist2){
                    return -1;
                }
                else if(dist1> dist2){
                    return 1;
                }
                else {
                    return  0;
                }

            }
        });

        int[][] ans = new int[B][2];
        for(int i=0; i<B; i++){
            ans[i][0] = mat[i][0];
            ans[i][1] = mat[i][1];
        }
        return ans;




    }
    public static double distance(Integer d[]){
        double x= d[0];
        double y=d[1];
        return  Math.sqrt(x*x + y*y);

    }

    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> a2= new ArrayList<>(new ArrayList<>(Arrays.asList(1,3),
       //                new ArrayList<>(Arrays.asList(-2,2));

        int a[][] = {
                {1, 3},
                {-2, 2}
        };
        int B=1;
        int ans[][]=fun(a,1);
        for(int i=0; i<B; i++) {
         System.out.print(ans[i] + " ");
        }

    }
}

