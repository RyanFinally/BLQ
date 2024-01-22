package Cases;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import static Util.Input.inputString;

public class ParkingTariff {
    public static void main(String[] args) {
//        String in = "27 Januari 2019 | 05:00:01";
//        String out = "27 Januari 2019 | 17:45:03";

        Scanner scanner = new Scanner(System.in);
        String in  = scanner.nextLine();
        String out = scanner.nextLine();
        parkingTariff(in,out);
        scanner.close();
    }

    private static long totalTime(String in, String out){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy | HH:mm:ss", new Locale("id"));
        LocalDateTime startDate = LocalDateTime.parse(in, formatter);
        LocalDateTime endDate = LocalDateTime.parse(out, formatter);

        return Duration.between(startDate, endDate).toHours();
    }

    private static double caseParkingTariff(long totalTime){
        double tariff = 0;

        if (totalTime <= 8) {
            tariff = totalTime * 1000;
        } else if (8 < totalTime && totalTime <= 24) {
            tariff = 8000;
        } else {
            tariff = 15000 + ((totalTime - 24) * 1000);
        }

        return tariff;
    }

    public static void parkingTariff(String in, String out){
        long totalTime = totalTime(in, out);
        System.out.println("Tariff: " + caseParkingTariff(totalTime));
    }
}
