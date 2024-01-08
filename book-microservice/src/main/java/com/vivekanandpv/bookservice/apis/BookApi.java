package com.vivekanandpv.bookservice.apis;

import com.vivekanandpv.bookservice.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")
public class BookApi {
    @GetMapping
    public ResponseEntity<Book> get() {
        return ResponseEntity.ok(new Book(45, "Learning Microservices", 900, 1500));
    }
}
