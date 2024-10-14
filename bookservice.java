package com.book2.book2api.service;

import com.book2.book2api.entity.book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class bookservice {
    static
    List<book> bookList = Arrays.asList(
            new book( 1, "jack","desc of state", 2007, "friction"),
            new book( 2, "mole","desc of state", 307, "host"),
            new book( 3, "jachin","desc of state", 703, "novel")
    );

    public List<book> getBooks(){
        return bookList;
    }

}