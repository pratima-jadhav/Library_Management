package Operation;

import Entity.Book;
import Entity.Member;
import service.Library;
import service.Transaction;

public class LibraryManagementSystem1 {
	public static void main(String[] args) {
		// Create library
		Library library = new Library();

		// Add books to library
		library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", true));
		library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", true));
		library.addBook(new Book("1984", "George Orwell", "Dystopian", true));

		// Add members to library
		Member member1 = new Member("Alice", "M001");
		Member member2 = new Member("Bob", "M002");
		library.addMember(member1);
		library.addMember(member2);

		// Display all books and members
		library.displayAllBooks();
		library.displayAllMembers();

		// Borrow and return books
		library.borrowBook("M001", "1984");
		library.returnBook("M001", "1984");

		// Transaction handling
		Transaction transactionLog = new Transaction();
		transactionLog.recordBorrowTransaction("M001", "1984");
		transactionLog.recordReturnTransaction("M001", "1984");

		// Display all transactions
		transactionLog.displayTransactions();
	}
}
