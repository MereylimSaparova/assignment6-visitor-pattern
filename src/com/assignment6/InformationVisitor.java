
package com.assignment6;

public class InformationVisitor implements LibraryVisitor {

    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle()
                + ", Price: " + book.getPrice() + " KZT");
    }

    @Override
    public void visit(Magazine magazine) {
        System.out.println("Magazine: " + magazine.getTitle()
                + ", Price: " + magazine.getPrice() + " KZT");
    }
}
