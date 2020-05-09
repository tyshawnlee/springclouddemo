package com.tyshawn.controller;

import com.tyshawn.entity.Book;
import com.tyshawn.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/book/add")
    public boolean addBook(@RequestBody Book book) {
        return bookService.add(book);
    }

    @GetMapping("/book/getById/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping("/book/getAllBook")
    public List<Book> getAllBook() {
        return bookService.getAllBook();
    }


    @GetMapping("/book/discovery")
    public Object discovery() {
        return discoveryClient;
    }
}
