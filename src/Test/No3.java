package Test;

import static Cases.ParkingTariff.parkingTariff;

public class No3 {
    public static void main(String[] args) {
        String in = "27 Januari 2019 | 05:00:01";
        String out = "27 Januari 2019 | 17:45:03";
        parkingTariff(in,out);
    }
}
