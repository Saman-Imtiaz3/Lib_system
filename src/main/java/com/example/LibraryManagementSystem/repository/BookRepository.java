package com.example.LibraryManagementSystem.repository;

import com.example.LibraryManagementSystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    //Book findByBookName(String bookName);
    //List<Book> findByStatus(String status);
    List<Book> findByBookName(String bookName);
}
