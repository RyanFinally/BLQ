package Cases;

import java.util.ArrayList;
import java.util.List;

import static Util.Convertion.convertToArrayString;
import static Util.Input.inputString;
import static Util.Print.printArray;

/**
 * Gunung: urutan Naik dan Turun yang bermula di 0 mdpl dan berakhir di 0 mdpl
 * Lembah: urutan Turun dan Naik yang bermula di 0 mdpl dan berakhir di 0 mdpl
 *
 * N N  T N N N  T  T  T  T  T N  T  T  T N  T N
 * 1 1 -1 1 1 1 -1 -1 -1 -1 -1 1 -1 -1 -1 1 -1 1
 * {                       } { } {              }
 *          mountain         valley    none
 *
 */
public class MountainAndValley {
    public static void main(String[] args) {
//        String input = "N N T N N N T T T T T N T T T N T N";
//        String input = "N T T N N N T N T T";
        String input = inputString();
        countMountainAndValley(input);
    }

    private static int[] caseMountainAndValley(String[] input){
        int height = 0;
        int mountain = 0;
        int valley = 0;
        for(int i = 0; i < input.length; i++) {
            if(input[i].equals("N")) {
                height++;
            } else {
                height--;
            }

            if(height == 0) {
                if(!input[i].equals("N")) {
                    mountain++;
                } else {
                    valley++;
                }
            }
        }
        return new int[]{mountain,valley};
    }

    public static void countMountainAndValley(String input){
        String[] convertedInput = convertToArrayString(input);
        int[] count = caseMountainAndValley(convertedInput);
        System.out.println("Mountain: " + count[0] + " Valley: " + count[1]);
    }



}
