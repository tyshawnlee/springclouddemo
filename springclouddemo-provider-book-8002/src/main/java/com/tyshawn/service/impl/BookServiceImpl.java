package com.tyshawn.service.impl;

import com.tyshawn.dao.IBookDao;
import com.tyshawn.entity.Book;
import com.tyshawn.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookDao bookDao;

    @Override
    public boolean add(Book book) {
        return bookDao.insert(book);
    }

    @Override
    public Book getById(int id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
