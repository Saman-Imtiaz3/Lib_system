$(document).ready(function () {
    // Add Student
    $('#addStudentBtn').click(function () {
        var studentData = {
            name: $('#studentName').val(),
            email: $('#studentEmail').val(),
            password: $('#studentPassword').val()
        };

        $.ajax({
            url: 'http://localhost:8091/students',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(studentData),
            success: function (response) {
                $('#responseMessage').text('Student added successfully!');
            },
            error: function (error) {
                $('#responseMessage').text('Error adding student.');
            }
        });
    });

    // Add Book
    $('#addBookBtn').click(function () {
        var bookData = {
            bookName: $('#bookName').val(),
            author: $('#authorName').val(),
            publisher: $('#publisherName').val(),
            status: 'Available'
        };

        $.ajax({
            url: 'http://localhost:8091/books',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(bookData),
            success: function (response) {
                $('#responseMessage').text('Book added successfully!');
            },
            error: function (error) {
                $('#responseMessage').text('Error adding book.');
            }
        });
    });

    // Issue Book
    $('#issueBookBtn').click(function () {
        var issueRequest = {
            bookName: $('#issueBookName').val(),
            studentId: $('#issueStudentId').val()
        };

        $.ajax({
            url: 'http://localhost:8091/books/get',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(issueRequest),
            success: function (response) {
                $('#responseMessage').text(response);
            },
            error: function (error) {
                $('#responseMessage').text('Error issuing book.');
            }
        });
    });

    // Return Book
    $('#returnBookBtn').click(function () {
        var returnRequest = {
            bookName: $('#returnBookName').val(),
            studentId: $('#returnStudentId').val()
        };

        $.ajax({
            url: 'http://localhost:8091/books/return',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(returnRequest),
            success: function (response) {
                $('#responseMessage').text(response);
            },
            error: function (error) {
                $('#responseMessage').text('Error returning book.');
            }
        });
    });
});
$(document).ready(function () {
    // Add Student
    $('#addStudentBtn').click(function () {
        var studentData = {
            name: $('#studentName').val(),
            email: $('#studentEmail').val(),
            password: $('#studentPassword').val()
        };

        $.ajax({
            url: 'http://localhost:8091/students',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(studentData),
            success: function (response) {
                $('#responseMessage').text('Student added successfully!');
            },
            error: function (error) {
                $('#responseMessage').text('Error adding student.');
            }
        });
    });

    // Add Book
    $('#addBookBtn').click(function () {
        var bookData = {
            bookName: $('#bookName').val(),
            author: $('#authorName').val(),
            publisher: $('#publisherName').val(),
            status: 'Available'
        };

        $.ajax({
            url: 'http://localhost:8091/books',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(bookData),
            success: function (response) {
                $('#responseMessage').text('Book added successfully!');
            },
            error: function (error) {
                $('#responseMessage').text('Error adding book.');
            }
        });
    });

    // Issue Book
    $('#issueBookBtn').click(function () {
        var issueRequest = {
            bookName: $('#issueBookName').val(),
            studentId: $('#issueStudentId').val()
        };

        $.ajax({
            url: 'http://localhost:8091/books/get',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(issueRequest),
            success: function (response) {
                $('#responseMessage').text(response);
            },
            error: function (error) {
                $('#responseMessage').text('Error issuing book.');
            }
        });
    });

    // Return Book
    $('#returnBookBtn').click(function () {
        var returnRequest = {
            bookName: $('#returnBookName').val(),
            studentId: $('#returnStudentId').val()
        };

        $.ajax({
            url: 'http://localhost:8091/books/return',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(returnRequest),
            success: function (response) {
                $('#responseMessage').text(response);
            },
            error: function (error) {
                $('#responseMessage').text('Error returning book.');
            }
        });
    });
});
