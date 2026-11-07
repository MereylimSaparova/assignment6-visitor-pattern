
package com.assignment6;

public interface LibraryVisitor {
    void visit(Book book);
    void visit(Magazine magazine);
}
