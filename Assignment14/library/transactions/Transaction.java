package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    private Book book;
    private Member member;
    private String issueDate;
    private String dueDate;

    public Transaction(Book book, Member member, String issueDate, String dueDate) {
        this.book = book;
        this.member = member;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        book.setAvailable(false);
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getDueDate() {
        return dueDate;
    }
}

