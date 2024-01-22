package Cases;

import java.util.*;

/**
 *
 * Andi memiliki sejumlah uang, dan dengan uang itu ia ingin membeli beberapa barang.
 * Jika Andi ingin menggunakan uang itu semaksimal mungkin,
 * buatlah sebuah kalkulasi jumlah maksimal uang yang bisa dipakai,
 * dan berapa item barang  yang bisa dibeli (jika jumlah uang yang dipakai sama, pilih kombinasi item terbanyak)
 * Contoh: Uang 1000
 * | Nama barang | Harga 1 | Harga 2 | Harga 3 | Harga 4 |
 * |-------------|---------|---------|---------|---------|
 * | Kaca_mata   | 500     | 600     | 700     | 800     |
 * | Baju        | 200     | 400     | 350     |         |
 * | Sepatu      | 400     | 350     | 200     | 300     |
 * | Buku        | 100     | 50      | 150     |         |
 *
 * Jumlah uang yang dipakai: 1000
 * Jumlah item yang bisa dibeli: 4 (kaca_mata 500, baju 200, sepatu 200, buku 100)
 *
 *
 */

public class MaximumItemPurchased {
    public static void main(String[] args) {
        int N = 1000;
        int[][] items = {
                {500, 600, 700, 800},
                {200, 400, 350},
                {4000, 3500, 2000, 3000},
                {1000, 500, 1500}
        };

        System.out.println(caseMaximumItemPurchased(items, N));
    }

    private static int caseMaximumItemPurchased(int[][] items, int targetSum) {
        int dimensions = items.length;
        int[][] dp = new int[dimensions + 1][targetSum + 1];

        for (int dimension = dimensions - 1; dimension >= 0; dimension--) {
            for (int remainingSum = 0; remainingSum <= targetSum; remainingSum++) {
                for (int i = 0; i < items[dimension].length; i++) {
                    int currentElement = items[dimension][i];

                    if (currentElement <= remainingSum) {
                        dp[dimension][remainingSum] = Math.max(dp[dimension][remainingSum],
                                1 + dp[dimension + 1][remainingSum - currentElement]);
                    }
                }
            }
        }

        return dp[0][targetSum];
    }
}
