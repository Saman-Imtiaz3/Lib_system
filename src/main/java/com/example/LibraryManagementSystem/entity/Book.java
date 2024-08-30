package com.example.LibraryManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;
    private String author;
    private String publisher;
    private String status; // "Available" or "Issued"
    private Integer studentId; // ID of the student who issued the book (null if not issued)

//    public class BookIssueRequest {
//        private String bookName;
//        private int studentId;
//
//        public String getBookName() {
//            return bookName;
//        }
//
//        public int getStudentId() {
//            return studentId;
//        }
//    }
}
