package Cases;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static Util.Convertion.convertToArrayString;
import static Util.Input.inputString;

/**
 * Tentukan apakah kalimat ini adalah Pangram* atau bukan
 * “Sphinx of black quartz, judge my vow”
 */
public class Pangram {
    public static void main(String[] args) {
//        String input = "Sphinx of black quartz, judge my vow";
        String input = inputString();
        isPangram(input);
    }

    private static boolean casePangram(String input){
        Set<Character> result = new HashSet<>();
        for (char i : input.toCharArray()){
            if(Character.isLetter(i))
                result.add(Character.toLowerCase(i));
        }
        return result.size()==26?true:false;
    }

    public static void isPangram(String input){
        if(casePangram(input)){
            System.out.println(input + " is pangram");
        }else {
            System.out.println(input + " is not pangram");
        }
    }



}
