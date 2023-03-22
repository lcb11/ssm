package com.lcb.service;

import com.lcb.pojo.Books;

import java.awt.print.Book;
import java.util.List;

/**
 *
 */
public interface BookService {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books book);

    //根据id查询一本书
    Book queryBookById(int id);

    //查询全部的书
    List<Books> queryAllBook();

}
