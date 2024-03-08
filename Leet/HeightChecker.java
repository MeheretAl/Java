package Leet;

import java.util.Arrays;


public  class HeightChecker {

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int answer = heightChecker(heights);
        System.out.println(answer);

    }

    public static int heightChecker(int[] heights){
        int[] answer = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            answer[i] = heights[i];
        }
        Arrays.sort(answer);
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != answer[i]){
                counter+=1;
            }
        }

        return counter;
    }
}
