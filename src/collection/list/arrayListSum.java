package collection.list;

import java.util.*;

public class arrayListSum {
    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
    {
        //Your code here

        int minInt;
        int maxCol=Integer.MIN_VALUE;

        ArrayList<Integer> al = new ArrayList<>();
        for(int k=0;k<arr.size();k++){
            if(arr.get(k).size()>maxCol){
                maxCol=arr.get(k).size();
            }
        }

        for(int i=0;i<maxCol;i++){
            int sum=0;
            for(int j=0;j<arr.size();j++){
                if(i<arr.get(j).size())
                    sum += arr.get(j).get(i);

            }
            al.add(sum);

        }
        minInt=Collections.min(al);
        return minInt;
    }

    public static void main(String[] args) {

    }
}
