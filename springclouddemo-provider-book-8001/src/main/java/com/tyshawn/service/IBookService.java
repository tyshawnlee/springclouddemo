package com.tyshawn.service;

import com.tyshawn.entity.Book;

import java.util.List;

public interface IBookService {
    boolean add(Book book);

    Book getById(int id);

    List<Book> getAllBook();

}
