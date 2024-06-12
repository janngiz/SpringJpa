package com.anurag.jpa.controller;

import com.anurag.jpa.entity.Author;
import com.anurag.jpa.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    // create a book
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping("/save")
    public Author create(@RequestBody Author author) {
        return authorService.save(author);
    }
}
