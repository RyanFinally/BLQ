package Test;

import static Cases.Fibonacci.fibonacci;
import static Util.Print.printArray;

public class No5 {
    public static void main(String[] args) {
        int input = 10;
        printArray(fibonacci(input));
    }
}
