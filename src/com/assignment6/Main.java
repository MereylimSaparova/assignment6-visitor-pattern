
package com.assignment6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final double EXPECTED_TOTAL = 15000.0;

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("Clean Code", 5000));
        items.add(new Book("Design Patterns", 6500));
        items.add(new Magazine("Science Weekly", 2000));
        items.add(new Magazine("Tech World", 1500));

        InformationVisitor informationVisitor =
                new InformationVisitor();

        PriceCalculatorVisitor priceVisitor =
                new PriceCalculatorVisitor();

        System.out.println("=== Library Items ===");

        for (LibraryItem item : items) {
            item.accept(informationVisitor);
        }

        for (LibraryItem item : items) {
            item.accept(priceVisitor);
        }

        System.out.println("=====================");
        System.out.println("Total Price: "
                + priceVisitor.getTotalPrice() + " KZT");

        if (Double.compare(priceVisitor.getTotalPrice(),
                EXPECTED_TOTAL) == 0) {
            System.out.println("Total Price Test: PASS");
        } else {
            System.out.println("Total Price Test: FAIL");
        }
    }
}
