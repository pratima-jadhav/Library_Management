package Entity;

import java.util.ArrayList;

public class Member {
	private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    // Constructor
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailability(false);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailability(true);
            System.out.println(name + " returned the book: " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow this book.");
        }
    }

}
