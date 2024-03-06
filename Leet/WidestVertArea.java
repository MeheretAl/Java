package Leet;

import java.util.ArrayList;
import java.util.Collections;

public class WidestVertArea {

    public static void main(String[] args) {
        int[][] check = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        int answer = widestVertArea(check);
        System.out.println(answer);


    }
    public static int widestVertArea(int[][] nums) {
        ArrayList<Integer> Points = new ArrayList<>();
        for (int[] num : nums) {
            Points.add(num[0]);
        }

        Collections.sort(Points);
        int maxlength = -63324;
        int length = Points.size();
        for (int i = 0; i < length-1; i++) {
            int diff = Points.get(i + 1) - Points.get(i);
            maxlength = Math.max(diff,maxlength);
        }
        return maxlength;

    }
}
