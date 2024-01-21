package Cases;

/**
 * Tentukan nilai minimal dan maksimal dari penjumlahan 4 komponen deret ini
 * 1 2 4 7 8 6 9
 *[1 2 4 7]       = 14
 *  [2 4 7 8]     = 21
 *    [4 7 8 6]   = 25
 *     [ 7 8 6 9] = 30
 */
public class MinMaxOfASeries {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 4, 7, 8, 6, 9};
        int inputWindowsWidth = 4;
        minMaxSubArraySum(input,inputWindowsWidth);
    }

    private static int maxSubarraySum(int[] input, int inputWindowsWidth) {
        int n = input.length;
        int windowSum = 0;

        for (int i = 0; i < inputWindowsWidth; i++) {
            windowSum += input[i];
        }
        int maxSum = windowSum;

        for (int i = inputWindowsWidth; i < n; i++) {
            windowSum = windowSum + input[i] - input[i - inputWindowsWidth];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    private static int minSubarraySum(int[] input, int inputWindowsWidth) {
        int n = input.length;
        int windowSum = 0;

        for (int i = 0; i < inputWindowsWidth; i++) {
            windowSum += input[i];
        }
        int minSum = windowSum;

        for (int i = inputWindowsWidth; i < n; i++) {
            windowSum = windowSum + input[i] - input[i - inputWindowsWidth];
            minSum = Math.min(minSum, windowSum);
        }

        return minSum;
    }

    public static void minMaxSubArraySum(int[] input, int inputWindowsWidth){
        System.out.println("Minimum: " + minSubarraySum(input,inputWindowsWidth)
                            + " | " + "Maximum: " + maxSubarraySum(input,inputWindowsWidth) );

    }
}
