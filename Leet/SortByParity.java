package Leet;

import java.util.Arrays;
import java.util.Comparator;

public class SortByParity {
    public static void main(String[] args) {

    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public static int[] sortByParity(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (isEvenNumber(nums[i]) && !(isEvenNumber(nums[j]))) {
                    int swap = nums[i];
                    nums[j] = nums[i];
                    nums[i] = swap;
                }
                else{
                    continue;
                }
            }
        }
        return nums;
    }


}


