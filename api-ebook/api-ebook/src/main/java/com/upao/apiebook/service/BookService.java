package com.upao.apiebook.service;

import com.upao.apiebook.model.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);

    List<Book> getAllBooks();
}
