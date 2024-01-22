package Cases;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static Util.Input.inputString;

public class ChangeTimeFormat {
    public static void main(String[] args) {
        String input = "03:40:44 PM";
//        String input = inputString();
        changeTimeFormat(input);
    }

    private static String caseChangeTimeFormat(String input){
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime localTime = LocalTime.parse(input, inputFormatter);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return localTime.format(outputFormatter);
    }

    public static void changeTimeFormat(String input){
        System.out.println(caseChangeTimeFormat(input));
    }
}
