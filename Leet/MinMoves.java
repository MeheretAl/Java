package Leet;

import java.util.Arrays;

public class MinMoves {
    public int minMoves(int[] seats, int[] students){
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for (int i = 0; i < students.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
}
