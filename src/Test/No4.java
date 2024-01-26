package Test;

import static Cases.PrimeNumber.prime;
import static Util.Print.printArray;

public class No4 {
    public static void main(String[] args) {
        int input = 10;
        printArray(prime(input));
    }
}
