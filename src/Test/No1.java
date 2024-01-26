package Test;

import Cases.MaximumItemPurchased;

import static Cases.MaximumItemPurchased.caseMaximumItemPurchased;

public class No1 {
    public static void main(String[] args) {
        int N = 1000;
        int[][] items = {
                {500, 600, 700, 800},
                {200, 400, 350},
                {400, 350, 200, 300},
                {100, 50, 150}
        };
        System.out.println(caseMaximumItemPurchased(items, N));
    }
}
