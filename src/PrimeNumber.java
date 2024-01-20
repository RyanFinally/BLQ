import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Util.Print.printArray;

/**
 * Buatlah fungsi untuk menampilkan n bilangan prima pertama
 * 2 3 5 7 11 13 17
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int input = 10;
        printArray(prime(input));
    }

    public static List<Integer> prime(int n){
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
