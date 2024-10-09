package service;
import Entity.*;
import java.util.ArrayList;

public class Transaction {
    private ArrayList<TransactionRecord> transactions;

    public Transaction() {
        transactions = new ArrayList<>();
    }

    // Record a borrow transaction
    public void recordBorrowTransaction(String memberId, String bookTitle) {
        TransactionRecord transaction = new TransactionRecord(memberId, bookTitle, "Borrow");
        transactions.add(transaction);
        transaction.displayTransaction();
    }

    // Record a return transaction
    public void recordReturnTransaction(String memberId, String bookTitle) {
        TransactionRecord transaction = new TransactionRecord(memberId, bookTitle, "Return");
        transactions.add(transaction);
        transaction.displayTransaction();
    }

    // Display all transactions
    public void displayTransactions() {
        System.out.println("All Transactions:");
        for (TransactionRecord transaction : transactions) {
            transaction.displayTransaction();
        }
    }
}
