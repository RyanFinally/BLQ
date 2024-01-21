package Cases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Util.Print.printArray;

/**
 * Deret: 3 9 0 7 1 2 4
 * N = 3	🡪 7 1 2 4 3 9 0
 * pretty much rotate the series
 */
public class RotateSeries {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(0);
        input.add(7);
        input.add(1);
        input.add(2);
        input.add(4);

        int nSteps = 3;
        leftRotate(input,nSteps);
        printArray(input);

    }
    public static void leftRotate(List<Integer> list, int nSteps) {
        Collections.rotate(list, -nSteps);
    }


}
