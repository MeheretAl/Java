package Leet;

public class SmallerThanCurrent {

    //sample example
    public static void main(String[] args) {
        int[] check = {6,5,4,8};
        int[] answer = smallerThanCurrent(check);
        for(int num: answer) {
            System.out.println(num);
        }
    }
    public static int[] smallerThanCurrent(int[] nums){
        int maxValue = Integer.MIN_VALUE;
        for( int num: nums){
            maxValue = Math.max(maxValue,num);
        }
        int[] counts = new int[maxValue+1];
        for(int num:nums){
            counts[num]++;
        }
        int[] cumulativeCounts = new int[maxValue+1];
        int previousSum = 0;
        for (int i = 0 ; i<maxValue; i++){
            previousSum += counts[i];
            cumulativeCounts[i+1] = previousSum;
        }

        int[] answerArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answerArray[i] = cumulativeCounts[nums[i]];
        }

        return answerArray;
    }
 }
