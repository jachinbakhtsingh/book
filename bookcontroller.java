package com.book2.book2api.controller;

import com.book2.book2api.entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.book2.book2api.service.bookservice;

import java.util.List;

@RestController
public class bookcontroller {

    @Autowired
    private bookservice bookservice;
    @RequestMapping(value="/books")

    public List<book> getbooks(){

        return bookservice.getBooks();


    }
}