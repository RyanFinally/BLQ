package Cases;

import static Util.Input.inputInteger;
import static Util.Print.printArray;

/**
 * N = 3 	🡪 3 6 9
 * N = 4	🡪 4 8 12 16
 * N = 5	🡪 5 10 15 20 25
 */
public class AdditionOfSeriesOfN {
    public static void main(String[] args) {
//        int input = 5;
        int input = inputInteger();
        printArray(series(input));
    }

    public static int[] series(int n){
        int[] inputArray = new int[n];
        inputArray[0] = n;
        for (int i = 1; i < n; i++) {
            inputArray[i]=inputArray[i-1]+n;
        }
        return inputArray;
    }
}
