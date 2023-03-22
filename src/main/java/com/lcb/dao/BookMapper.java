package com.lcb.dao;

import com.lcb.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    Book queryBookById(@Param("bookId") int id);

    //查询全部的书
    List<Books> queryAllBook();

    //跟新书本
    int updateBook(Books books);
}
