package com.anurag.jpa.service;

import com.anurag.jpa.entity.Author;
import com.anurag.jpa.repo.AuthorRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo authorRepo;

    public Author save(Author author) {
        //   Author save = authorRepo.save(author);
        Author save = authorRepo.findById(2l).orElseThrow(() -> new RuntimeException("User not found"));

        save.setName("hullulu");
        return save;
    }
}
