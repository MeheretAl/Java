package Leet;

public class SmallerThanCurrent {

    //sample example
    public static void main(String[] args) {
        int[] check = {8,1,2,2,3};
        int[] answer = smallerThanCurrent(check);
        for(int num: answer) {
            System.out.println(num);
        }
    }
    public static int[] smallerThanCurrent(int[] nums){
        // {8,1,2,2,3}
        // {4,0,1,1,2}

        int length = nums.length;
        int[] answer = new int[length];
        for (int j = 0; j < length; j++){
            int counter = 0;
            int i = 0;
            while (i < length) {
                if (nums[j] > nums[i]){
                    counter+=1;
                }
                i++;
                answer[j] = counter;
            }
        }


    return answer;
    }
 }
