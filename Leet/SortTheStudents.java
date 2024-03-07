package Leet;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheStudents {
    public static void main(String[] args) {
        int[][] scores = {
                {90, 85, 88},
                {80, 75, 82},
                {95, 92, 98}
        };
        int k = 0;
        int[][] answers = sortTheStudents(scores,k);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(Arrays.toString(answers[i]));
        }

    }
    public static int[][] sortTheStudents(int[][] score,final int k){
        Arrays.sort(score, new Comparator<int[]>() {
           public int compare(int[] num1,int[]num2){
               return Integer.compare(num2[k],num1[k]);
           }
        });
        return score;

    }
}
