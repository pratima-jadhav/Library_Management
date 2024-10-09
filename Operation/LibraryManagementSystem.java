package Operation;

import java.util.ArrayList;
import java.util.Scanner;

import Entity.Book;
import Entity.Member;
import service.Library;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Borrow a Book");
            System.out.println("6. Return a Book");
            System.out.println("7. Display All Books");
            System.out.println("8. Add Member");
            System.out.println("9. Remove Member");
            System.out.println("10. Display All Members");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book category: ");
                    String category = scanner.nextLine();
                    Book book = new Book(title, author, category, false);
                    library.addBook(book);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.print("Enter the title of the book to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.removeBook(removeTitle);
                    System.out.println("Book removed successfully!");
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBookByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter title to search books: ");
                    String searchTitle1 = scanner.nextLine();
                    Book booksByTitle = library.searchBookByTitle(searchTitle1);
                    if (!booksByTitle.isEmpty()) {
                        System.out.println("Books by " + searchTitle1 + ":");
                       
                            System.out.println(booksByTitle);
                       
                    } else {
                        System.out.println("No books found by this author.");
                    }
                    break;
                case 5:
                    System.out.print("Enter member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(memberId, borrowTitle);
                    break;
                case 6:
                    System.out.print("Enter member ID: ");
                    String returnMemberId = scanner.nextLine();
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnMemberId, returnTitle);
                    break;
                case 7:
                    library.displayAllBooks();
                    break;
                case 8:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    String newMemberId = scanner.nextLine();
                    Member newMember = new Member(name, newMemberId);
                    library.addMember(newMember);
                    System.out.println("Member added successfully!");
                    break;
                case 9:
                    System.out.print("Enter member ID to remove: ");
                    String removeMemberId = scanner.nextLine();
                    library.removeMember(removeMemberId);
                    System.out.println("Member removed successfully!");
                    break;
                case 10:
                    library.displayAllMembers();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
