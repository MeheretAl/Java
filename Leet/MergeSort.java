package Leet;
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.print("Original array:");
        printArray(array);
        int[] sortedArray = mergesort(array);
        System.out.print("\nSorted array:");
        printArray(sortedArray);
    }

    public static int[] mergesort(int[] array){
       if (array.length <= 1) {
           return array;
       }
       int length = array.length;
       int[] leftarray = new int[length/2];
       int[] rightarray = new int[length - length/2];

        for (int i = 0; i < length/2; i++) {
            leftarray[i] = array[i];

        }
        for (int i = length/2; i < length; i++) {
            rightarray[i-length/2] = array[i];
        }

        leftarray = mergesort(leftarray);
        rightarray = mergesort(rightarray);

        return merge(leftarray,rightarray);
    }

    public static int[] merge(int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int[] mergedArray = new int[leftLength + rightLength];
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                mergedArray[k++] = left[i++];
            } else {
                mergedArray[k++] = right[j++];
            }
        }
        while (i < leftLength) {
            mergedArray[k++] = left[i++];
        }
        while (j < rightLength) {
            mergedArray[k++] = right[j++];
        }
        return mergedArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
