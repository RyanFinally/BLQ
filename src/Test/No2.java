package Test;

import java.util.HashMap;
import java.util.Map;

import static Cases.LibraryPenalty.libraryPenalty;

public class No2 {
    public static void main(String[] args) {
        String aBorrowDate = "28 Februari 2016";
        String aReturnDate = "7 Maret 2016";

        String bBorrowDate = "29 April 2018";
        String bReturnDate = "30 Mei 2018";

        Map<String, Integer> bookMaximumBorrowingDays = new HashMap<>();
        bookMaximumBorrowingDays.put("A",14);
        bookMaximumBorrowingDays.put("B",3);
        bookMaximumBorrowingDays.put("C",7);
        bookMaximumBorrowingDays.put("D",7);

        System.out.println("Case a " + aBorrowDate + " until " + aReturnDate);
        libraryPenalty(bookMaximumBorrowingDays, aBorrowDate, aReturnDate);

        System.out.println();

        System.out.println("Case b " + bBorrowDate + " until " + bReturnDate);
        libraryPenalty(bookMaximumBorrowingDays, bBorrowDate, bReturnDate);
    }
}
