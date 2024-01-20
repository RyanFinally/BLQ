package Cases;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static Util.Input.inputString;

/**
 * degree of hourhand = 360/12 = 30
 * hourhand also moves every minute which means
 * it moves 30 degree / 60 minutes = 1/2 degree/minutes
 * degree of minute hand = 360 degree/60 minutes  = 6 degree/minutes
 * which means the actual degree/minute is
 * 6 d/m - 1/2 d/m = 11/2 d/m
 */

public class ClockDegree {
    public static void main(String[] args) {
//        String input = "2:20";
        System.out.print("Input HH:mm : ");
        String input = inputString();
        clockDegree(input);
    }
    private static float caseClockDegree(String input) {
        float result = 0;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime time = LocalTime.parse(input, formatter);
            float[] arrayInput = {time.getHour(), time.getMinute()};
            float hour = arrayInput[0];
            float minute = arrayInput[1];

            if (hour > 11) {
                hour -= 12;
            }

            float degree = 30 * hour - 11 * minute / 2;
            if (hour >= 6.0 && hour < 12) {
                degree -= 360;
            }
            result = Math.abs(degree);
            if (result == 360) {
                result = 0;
            }
            return result;

        } catch (DateTimeException e) {
            return Float.NaN;
        }

    }

    public static void clockDegree(String input){
        float degree = caseClockDegree(input);
        if(Float.isNaN(degree)){
            System.out.println("Invalid Input");
        }else {
            System.out.println(input + " is " + degree + " degree");
        }
    }
}
