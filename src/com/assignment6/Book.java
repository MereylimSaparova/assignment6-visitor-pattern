
package com.assignment6;

import java.util.Objects;

public class Book implements LibraryItem {

    private final String title;
    private final double price;

    public Book(String title, double price) {
        this.title = Objects.requireNonNull(
                title, "Title cannot be null");

        if (price < 0) {
            throw new IllegalArgumentException(
                    "Price cannot be negative");
        }

        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(LibraryVisitor visitor) {
        Objects.requireNonNull(visitor, "Visitor cannot be null");
        visitor.visit(this);
    }
}
