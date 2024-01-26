package Test;

import static Cases.WalkAndJumpGame.solveManholeGame;

public class No21 {
    public static void main(String[] args) {
        String result = solveManholeGame("_ _ _ _ _ O _ _ _ Finish");
        String result1 = solveManholeGame("O _ _ _ O _ _ _ Finish");
        System.out.println(result);
        System.out.println(result1);
    }
}
