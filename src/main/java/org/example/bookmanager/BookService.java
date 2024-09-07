package org.example.bookmanager;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@org.springframework.stereotype.Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    public List<Book> getAllBooks() {
      return bookRepo.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepo.findById(id).get();
    }
    public Book addBook(Book book) {
        return bookRepo.save(book);
    }
    public Book updateBook(Long id, Book book) {
        return bookRepo.save(book);
    }
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
