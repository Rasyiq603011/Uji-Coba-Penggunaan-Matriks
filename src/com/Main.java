package com;

public class Main {
    public static void main(String[] args) {
        // Membuat buku
        Book book1 = new Book("B001", "Java Programming", "John Doe");
        Book book2 = new Book("B002", "Python Basics", "Jane Smith");
        
        // Membuat anggota
        Member member = new Member("M001", "Alice", "alice@example.com");
        
        // Membuat perpustakaan
        Library library = new Library();
        
        // Menambahkan buku ke perpustakaan
        library.addBook(book1);
        library.addBook(book2);
        
        // Mendaftarkan anggota
        library.registerMember(member);
        
        // Meminjam buku
        boolean borrowed = library.borrowBook("B001", "M001");
        System.out.println("Book borrowed: " + borrowed);
        
        // Mencari buku
        Book foundBook = library.findBookById("B002");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook.getTitle());
        }
        
        // Membuat laporan
        LibraryReport report = new LibraryReport(library);
        report.generateBorrowingReport();
    }
}
