package com.lcb.controller;

import com.lcb.pojo.Books;
import com.lcb.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller层调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部书籍，返回一个页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        System.out.println(books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }


    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Book books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("book", books);
        return "updateBook";
    }
}
//
//    @RequestMapping("/updateBook")
//    public String updateBook(Model model, Books book) {
//        System.out.println(book);
//        bookService.updateBook(book);
//        Books books = bookService.queryBookById(book.getBookID());
//        model.addAttribute("books", books);
//        return "redirect:/book/allBook";
//    }
//}

//
//    @RequestMapping("/del/{bookId}")
//    public String deleteBook( @Param("bookId") int id) {
//        bookService.deleteBookById(id);
//        return "redirect:/book/allBook";
//    }

