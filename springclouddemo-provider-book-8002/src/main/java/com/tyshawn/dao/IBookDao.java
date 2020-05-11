package com.tyshawn.dao;

import com.tyshawn.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IBookDao {

    boolean insert(Book book);

    Book getById(int id);

    List<Book> getAllBook();

}
