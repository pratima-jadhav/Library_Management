package Entity;

import java.util.ArrayList;
import java.util.Date;

public class TransactionRecord {
    private String memberId;
    private String bookTitle;
    private String transactionType;
    private Date transactionDate;

    public TransactionRecord(String memberId, String bookTitle, String transactionType) {
        this.memberId = memberId;
        this.bookTitle = bookTitle;
        this.transactionType = transactionType;
        this.transactionDate = new Date();
    }

    public void displayTransaction() {
        System.out.println("Member ID: " + memberId + ", Book Title: " + bookTitle + ", Type: " + transactionType + ", Date: " + transactionDate);
    }
}

