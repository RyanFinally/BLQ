package Util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);
    public static String inputString(){
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static int inputInteger(){
        int input = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        return input;
    }
}
