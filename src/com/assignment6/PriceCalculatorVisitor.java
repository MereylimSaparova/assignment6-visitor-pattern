
package com.assignment6;

public class PriceCalculatorVisitor implements LibraryVisitor {

    private double totalPrice = 0;

    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
    }

    @Override
    public void visit(Magazine magazine) {
        totalPrice += magazine.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
