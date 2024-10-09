package service;

import java.util.HashMap;

import Entity.Book;
import Entity.Member;

import java.util.ArrayList;

public class Library {
	private HashMap<String, Book> books;
	private HashMap<String, Member> members;

	// Constructor
	public Library() {
		books = new HashMap<>();
		members = new HashMap<>();
	}

	// Add a new book to the library
	public void addBook(Book book) {
		books.put(book.getTitle(), book);
		System.out.println("Book added: " + book.getTitle());
	}

	// Remove a book from the library
	public void removeBook(String title) {
		books.remove(title);
		System.out.println("Book removed: " + title);
	}

	
	public void removeMember(String memberId) {
		books.remove(memberId);
		System.out.println("member removed successfully...");
	}
	// Search for a book by title
	public Book searchBookByTitle(String title) {
		return books.get(title);
	}

	// Add a new member to the library
	public void addMember(Member member) {
		members.put(member.getMemberId(), member);
		System.out.println("Member added: " + member.getName());
	}

	// Display all books
	public void displayAllBooks() {
		System.out.println("All Books in the Library:");
		for (Book book : books.values()) {
			System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: "
					+ book.isAvailable());
		}
	}

	// Display all members
	public void displayAllMembers() {
		System.out.println("All Members in the Library:");
		for (Member member : members.values()) {
			System.out.println("Member: " + member.getName() + ", Member ID: " + member.getMemberId());
		}
	}

	// Borrow a book for a member
	public void borrowBook(String memberId, String bookTitle) {
		Member member = members.get(memberId);
		Book book = books.get(bookTitle);
		if (member != null && book != null) {
			member.borrowBook(book);
		} else {
			System.out.println("Invalid member ID or book title.");
		}
	}

	// Return a book for a member
	public void returnBook(String memberId, String bookTitle) {
		Member member = members.get(memberId);
		Book book = books.get(bookTitle);
		if (member != null && book != null) {
			member.returnBook(book);
		} else {
			System.out.println("Invalid member ID or book title.");
		}
	}
}
