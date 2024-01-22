package Cases;

/**
 * A and B person
 * win + two distance
 * lose - one distance
 *
 * example :
 * initialDistance = 2
 * A = G G G
 * B = K K B
 *
 * A__B
 * 1. G K
 * A+2 B-(-1)
 *
 * __AB
 * 2. G K
 * A+2 B-(-1)
 *
 * A = 0
 * B = initialDistance
 *
 * A = 4
 * B = 4
 */
public class PaperRockScissor {
    public static void main(String[] args) {
        int initialDistance = 2;
        String[] aCombination = new String[]{"G", "G", "G"};
        String[] bCombination = new String[]{"K", "K", "B"};

        paperRockScissor(initialDistance, aCombination, bCombination);
    }

    private static String[] trackWinner(String[] a, String[] b){
        String[] trackA = new String[a.length];
        for (int i = 0; i <a.length; i++) {
            if(a[i].equals(b[i])){
                trackA[i] = "Draw";
            }else if(
                    (a[i].equals("G") && b[i].equals("K")) ||
                    (a[i].equals("K") && b[i].equals("B")) ||
                    (a[i].equals("B") && b[i].equals("G"))){
                trackA[i] = "Win";
            }else{
                trackA[i] = "Lose";
            }
        }
        return trackA;
    }

    private static String game(String[] input, int initialDistance){
        int aRelativePosition = 0;
        int bRelativePosition = initialDistance;
        int lastRound = 0;
        boolean meet = false;

        for (int i = 0; i < input.length; i++) {
            if(aRelativePosition == bRelativePosition){
                meet = true;
                lastRound = i-1;
                break;
            } else if(input[i].equals("Win")){
                aRelativePosition += 2;
                bRelativePosition += 1;
                meet = false;
            } else if (input[i].equals("Lose")) {
                aRelativePosition -= 1;
                bRelativePosition -= 2;
                meet = false;
            } else {
                aRelativePosition += 0;
                bRelativePosition += 0;
                meet = false;
            }

        }

        if(meet){
            if(input[lastRound].equals("Win")){
                return "A";
            }
            return "B";
        }

        return "Draw";
    }

    public static void paperRockScissor(int initialDistance, String[] a, String[] b){
        String[] trackWinner = trackWinner(a,b);
        String winner = game(trackWinner, initialDistance);
        System.out.println("The winner is: " + winner);
    }
}
