package Test;

import static Cases.AdditionOfSeriesOfN.series;
import static Util.Input.inputInteger;
import static Util.Print.printArray;

public class No9 {
    public static void main(String[] args) {
        int input = 5;
        printArray(series(input));
    }
}
