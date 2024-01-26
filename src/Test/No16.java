package Test;

import static Cases.SplitBill.splitBill;

public class No16 {
    public static void main(String[] args) {
        int[][] menu = new int[][]{
                {42000,1},
                {50000,0},
                {30000,0},
                {70000,0},
                {30000,0}
        };

        int totalPerson = 4;
        int allergicPerson = 1;

        splitBill(menu,totalPerson,allergicPerson);
    }
}
