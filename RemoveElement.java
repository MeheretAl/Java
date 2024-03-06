public class RemoveElement {
    public static void main(String[] args) {
        int[] check = {0, 1, 2, 2, 3, 0, 4, 2};
        int target = 2;
        removeElement(check, target);
        for (int i = 0; i < check.length; i++) {
            System.out.print(check[i] + " ");
        }
    }

    public static void removeElement(int[] nums, int target) {
        int length = nums.length;
        int counter = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                counter += 1;
            }
        }

        int lastIndex = length - 1;
        for (int i = 0; i < lastIndex; i++) {
            if (nums[i] == target) {
                while (lastIndex > i && nums[lastIndex] == target) {
                    lastIndex--;
                }
                if (lastIndex > i) {
                    int temp = nums[i];
                    nums[i] = nums[lastIndex];
                    nums[lastIndex] = temp;
                    lastIndex--;
                }
            }
        }
    }
}
