package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Save a new book to the repository
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // Retrieve all books from the repository
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Retrieve a book by its name
    public Book getBookByName(String bookName) {
        return bookRepository.findByBookName(bookName).stream().findFirst().orElse(null);
    }

    // Issue a book to a student
    public String issueBook(String bookName, int studentId) {
        List<Book> books = bookRepository.findByBookName(bookName);
        if (books.isEmpty()) {
            return "Book not found";
        }

        // Handle the case where multiple books are returned
        Book bookToIssue = books.stream()
                .filter(book -> "Available".equals(book.getStatus()))
                .findFirst()
                .orElse(null);

        if (bookToIssue == null) {
            return "No available copies of the book";
        }

        bookToIssue.setStatus("Issued");
        bookToIssue.setStudentId(studentId);
        bookRepository.save(bookToIssue);
        return "Book issued successfully";
    }

    // Return a book from a student
    public String returnBook(String bookName, int studentId) {
        List<Book> books = bookRepository.findByBookName(bookName);
        if (books.isEmpty()) {
            return "Book not found";
        }

        Book bookToReturn = books.stream()
                .filter(book -> "Issued".equals(book.getStatus()) && book.getStudentId() == studentId)
                .findFirst()
                .orElse(null);

        if (bookToReturn == null) {
            return "This book is not issued to the student";
        }

        bookToReturn.setStatus("Available");
        bookToReturn.setStudentId(null);
        bookRepository.save(bookToReturn);
        return "Book returned successfully";
    }

}
