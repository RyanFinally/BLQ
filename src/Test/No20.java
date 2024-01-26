package Test;

import static Cases.PaperRockScissor.paperRockScissor;

public class No20 {
    public static void main(String[] args) {
        int initialDistance = 2;
        String[] aCombination = new String[]{"G", "G", "G"};
        String[] bCombination = new String[]{"K", "K", "B"};

        paperRockScissor(initialDistance, aCombination, bCombination);
    }
}
