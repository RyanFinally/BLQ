package Test;

import static Cases.MinMaxOfASeries.minMaxSubArraySum;

public class No8 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 4, 7, 8, 6, 9};
        int inputWindowsWidth = 4;
        minMaxSubArraySum(input,inputWindowsWidth);
    }
}
