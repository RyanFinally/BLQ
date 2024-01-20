package Cases;

import Util.Print;

import java.util.HashMap;
import java.util.Map;

import static Util.Print.printArray;

/**
 * Buatlah fungsi untuk menampilkan n bilangan Cases.Fibonacci pertama
 * 0,1,1,2,3,5,8,13
 * n-1 , n-2
 * (n-1)-1, (n-1)-2  | ((n-2)-1), ((n-2)-2)
 */
public class Fibonacci {
    public static void main(String[] args) {
        int input = 10;
        printArray(fibonacci(input));
    }

    public static int[] fibonacci(int n){
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n ; i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib;

    }
}
