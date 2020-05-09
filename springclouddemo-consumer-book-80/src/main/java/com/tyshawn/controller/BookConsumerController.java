package com.tyshawn.controller;

import com.tyshawn.entity.Book;
import com.tyshawn.feign.BookFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookConsumerController {
    @Autowired
    private BookFeign bookFeign;

    @GetMapping("/consumer/book/list")
    public List<Book> listByFeign() {
        return bookFeign.list();
    }
}
