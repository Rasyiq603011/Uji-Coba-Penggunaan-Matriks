package com;


public class LibraryReport {
    private Library library;
    
    public LibraryReport(Library library) {
        this.library = library;
    }
    
    public void generateBorrowingReport() {
        System.out.println("=== BORROWING REPORT ===");
        for (Member member : library.getAllMembers().values()) {
            System.out.println("Member: " + member.getName());
            System.out.println("Borrowed books: " + member.getBorrowedBooks().size());
            for (Book book : member.getBorrowedBooks()) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
            System.out.println();
        }
    }
    
    public void generateBookInventoryReport() {
        int availableCount = 0;
        int borrowedCount = 0;
        
        System.out.println("=== BOOK INVENTORY REPORT ===");
        for (Book book : library.getAllBooks()) {
            if (book.isAvailable()) {
                availableCount++;
            } else {
                borrowedCount++;
            }
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + 
                            " [" + (book.isAvailable() ? "Available" : "Borrowed") + "]");
        }
        
        System.out.println("\nTotal books: " + (availableCount + borrowedCount));
        System.out.println("Available books: " + availableCount);
        System.out.println("Borrowed books: " + borrowedCount);
    }
}

