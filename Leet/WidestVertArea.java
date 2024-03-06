package Leet;


import java.util.Arrays;


public class WidestVertArea {

    public static void main(String[] args) {
        int[][] check = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        int answer = widestVertArea(check);
        System.out.println(answer);


    }
    public static int widestVertArea(int[][] nums) {
        int length = nums.length;
        int[] xpoints = new int[length];
        for (int i = 0; i < length; i++) {
            xpoints[i] = nums[i][0];
        }

        Arrays.sort(xpoints);
        int maxlength = Integer.MIN_VALUE; // minimum value possible for int data type
        for (int i = 0; i < length-1; i++) {
            int diff = xpoints[i+1] - xpoints[i];
            maxlength = Math.max(diff,maxlength); // find maximum value between two numbers
        }
        return maxlength;

    }
}
