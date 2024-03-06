package Leet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairs {
    //example
    public static void main(String[] args) {
        Integer[] array = {-6,2,5,-2,-7,-1,3};
        List<Integer> nums = Arrays.asList(array);
        int target = -2;
        int answer = countPairs(nums,target);
        System.out.println(answer);

    }

    public static int countPairs(List<Integer> nums, int target){
        Collections.sort(nums);

        int answer = 0;
        int start = 0, end = nums.size() -1;
        while (start < end) {
            if (nums.get(start) + nums.get(end) < target) {
                answer += end - start;
                start++;
            } else {
                end--;
            }
        }
        return answer;
    }
}
