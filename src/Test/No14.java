package Test;

import java.util.ArrayList;
import java.util.List;

import static Cases.RotateSeries.leftRotate;
import static Util.Print.printArray;

public class No14 {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(9);
        input.add(0);
        input.add(7);
        input.add(1);
        input.add(2);
        input.add(4);

        printArray(input);
        System.out.println();
        int nSteps = 3;
        leftRotate(input,nSteps);
        printArray(input);
    }
}
