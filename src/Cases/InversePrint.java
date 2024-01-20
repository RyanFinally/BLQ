package Cases;

import static Util.Input.inputString;

/**
 * Input: Afrika
 * Output:
 * ***a***
 * ***k***
 * ***i***
 * ***r***
 * ***f***
 * ***A***
 */
public class InversePrint {
    public static void main(String[] args) {
//        String input = "Afrika";
        String input = inputString();
        inversePrint(input);
    }

    private static String[] caseInversePrint(String input){
        String[] result = new String[input.length()];
        String pattern = "***";
        for (int i = 0; i < input.length(); i++) {
            result[i] = pattern + input.charAt(input.length()-i-1) + pattern;
        }
        return result;
    }

    public static void inversePrint(String input){
        String[] inputString = caseInversePrint(input);
        for(String i : inputString){
            System.out.println(i);
        }
    }
}
