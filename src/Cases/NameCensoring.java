package Cases;

import static Util.Convertion.convertToArrayString;
import static Util.Input.inputString;

/**
 * Susilo Bambang Yudhoyono
 * S***o B***g Y***o
 */
public class NameCensoring {
    public static void main(String[] args) {
//        String input = "Susilo Bambang Yudhoyono";
        String input = inputString();
        nameCensoring(input);
    }

    private static String[] caseNameCensoring(String input){
        String[] convertedInput = convertToArrayString(input);
        String[] result = new String[convertedInput.length];
        for (int i = 0; i < convertedInput.length; i++) {
            String currentWord = convertedInput[i];
            int currentWordLength = currentWord.length();
            result[i] = currentWord.substring(0,1)+"***"+currentWord.substring(currentWordLength-1);
        }

        return result;
    }

    public static void nameCensoring(String input){
        String[] inputString = caseNameCensoring(input);
        for(String i : inputString){
            System.out.print(i + " ");
        }
    }
}
