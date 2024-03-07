package Leet;


public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] sorted = sortThePeople(names,heights);

    }

    public static String[] sortThePeople(String[] names, int[] heights){
        int length = heights.length;
        for (int i = 0; i < length-1;i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (heights[j] < heights[j+1]){
                    int swap  =  heights[j];
                    String swapString = names[j];
                    heights[j] = heights[j+1];
                    names[j] = names[j+1];
                    heights[j+1] = swap;
                    names[j+1] = swapString;
                }
            }
        }
        return names;
    }
}
