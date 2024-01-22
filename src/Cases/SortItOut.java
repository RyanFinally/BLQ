package Cases;

import static Util.Convertion.convertToArrayString;
import static Util.Input.inputString;
import static Util.Print.printArray;

/**
 * Input: 1 2 1 3 4 7 1 1 5 6 1 8
 *
 * Output: 1 1 1 1 1 2 3 4 5 6 7 8
 */

public class SortItOut {
    public static void main(String[] args) {
//        String input = "1 2 1 3 4 7 1 1 5 6 1 8";
        String input = inputString();
        sortItOut(input);
    }

    private static int[] convertToArrayInt(String input){
        String[] arrayString = convertToArrayString(input);
        int[] result = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            String currentString = arrayString[i];
            int currentInt = Integer.parseInt(currentString);
            result[i] = currentInt;
        }
        return result;
    }

    private static int[] caseSortItOut(int[] array){
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        int[] countArray = new int[max + 1];

        for (int num : array) {
            countArray[num]++;
        }

        for (int i = 1; i <= max; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] resultArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            int num = array[i];
            resultArray[countArray[num] - 1] = num;
            countArray[num]--;
        }

        return resultArray;
    }

    public static void sortItOut(String input){
        int[] arrayInput = convertToArrayInt(input);
        int[] arrayResult = caseSortItOut(arrayInput);
        System.out.println("Array input: ");
        printArray(arrayInput);
        System.out.println();
        System.out.println("Array output: ");
        printArray(arrayResult);
    }
}
