package Leet;
public class RemoveElement {
    public static void main(String[] args) {
        int[] check = {0, 1, 2, 2, 3, 0, 4, 2};
        int target = 2;
        removeElement(check, target);
        for (int j : check) {
            System.out.print(j + " ");
        }
    }

    public static void removeElement(int[] nums, int target) {
        int counter = 0;
        for (int num: nums){
            if (num != target){
                nums[counter] = num;
                counter++;
            }
        }
    }
}
