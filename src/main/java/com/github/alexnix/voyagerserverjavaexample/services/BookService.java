package com.github.alexnix.voyagerserverjavaexample.services;

import com.github.alexnix.repositories.VoyagerRepositoryJPA;
import com.github.alexnix.services.VoyagerServiceJPA;
import com.github.alexnix.voyagerserverjavaexample.models.Book;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class BookService extends VoyagerServiceJPA<Book> {
    public BookService(@NotNull VoyagerRepositoryJPA<Book> repo) {
        super(repo);
    }
}
