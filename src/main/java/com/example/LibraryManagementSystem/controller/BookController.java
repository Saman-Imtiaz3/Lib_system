package com.example.LibraryManagementSystem.controller;

import com.example.LibraryManagementSystem.DTO.IssueRequest;
import com.example.LibraryManagementSystem.entity.Book;
import com.example.LibraryManagementSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{bookName}")
    public Book getBookByName(@PathVariable String bookName) {
        return bookService.getBookByName(bookName);
    }

    @PostMapping("/get")
    public String issueBook(@RequestBody IssueRequest request) {
        return bookService.issueBook(request.getBookName(), request.getStudentId());
    }


//    @PostMapping("/return")
//    public String returnBook(@RequestParam String bookName, @RequestParam int studentId) {
//        return bookService.returnBook(bookName, studentId);
//    }

    @PostMapping("/return")
    public ResponseEntity<String> returnBook(@RequestBody IssueRequest request) {
        String result = bookService.returnBook(request.getBookName(), request.getStudentId());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
