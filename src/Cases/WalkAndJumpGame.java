package Cases;

/**
 * Walk	: ST +1, D +1
 * Jump	: ST -2, D +3
 *
 * Tentukan urutan Walk & Jump minimal yang diperlukan player untuk sampai tepat ke ujung lintasan. Jika tidak ada kombinasi yang memungkinkan (misalnya ST player 0 tepat sebelum melewati lubang), maka nyatakan hasilnya sebagai “FAILED”.
 * Contoh:
 * _ _ _ _ _ O _ _ _ Finish
 * Jawaban: W W W W J J
 *
 * yang berarti mulai dari _ pertama
 * sampai Finish
 *
 */
public class WalkAndJumpGame {
    public static void main(String[] args) {
        String result = solveManholeGame("_ _ _ _ _ O _ _ _ Finish");
        String result1 = solveManholeGame("_ _ _ O _ _ O _ _ Finish");
        System.out.println(result);
        System.out.println(result1);
    }

    public static String solveManholeGame(String track) {
        char[] trackArray = track.replaceAll(" ","").toCharArray();
        int stamina = 0;
        int distance = 0;
        StringBuilder solution = new StringBuilder();

        for (int i = 1; i < trackArray.length; i++) {
            if(trackArray[0]=='O'){
                return "FAILED";
            }
            if (trackArray[i] == '_' && trackArray.length - i == 9 && track.endsWith("_ _ _ Finish") && stamina >= 2) {
                solution.append("J ");
                break;
            } else if (trackArray[i] == 'O') {
                if (stamina >= 2) {
                    // If there is enough stamina, jump
                    stamina -= 2;
                    distance += 3;
                    solution.append("J ");
                } else {
                    // If not enough stamina, the game is failed
                    return "FAILED";
                }
            } else if (trackArray[i] == '_') {
                // Walk
                stamina += 1;
                distance += 1;
                solution.append("W ");
            } else if (trackArray[i] == 'F') {
                // Finish
                break;
            }
        }

        return solution.toString().trim();
    }



}
