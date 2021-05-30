package com.github.alexnix.voyagerserverjavaexample.controllers;

import com.github.alexnix.voyagerserverjavaexample.models.Book;
import com.github.alexnix.voyagerserverjavaexample.services.BookService;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import voyager.framework.server.controllers.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookCtrl extends VoyagerController<Book, BookService> {
    public BookCtrl(@NotNull BookService service) {
        super(service, new DefaultACL<>(), new DefaultHooks<>());
    }

    @Override
    public boolean createAcl(@NotNull Book item) {
        return super.createAcl(item);
    }

    @Override
    public boolean deleteAcl(@NotNull Book item) {
        return super.deleteAcl(item);
    }

    @Override
    public boolean readManyAcl() {
        return super.readManyAcl();
    }

    @Override
    public boolean readOneAcl(@NotNull Book item) {
        return super.readOneAcl(item);
    }

    @Override
    public boolean updateAcl(@NotNull Book old, @NotNull Book book) {
        return super.updateAcl(old, book);
    }

    @NotNull
    @Override
    public Object afterCreate(@NotNull Book item) {
        return super.afterCreate(item);
    }

    @NotNull
    @Override
    public Object afterDelete(@NotNull Book item) {
        return super.afterDelete(item);
    }

    @NotNull
    @Override
    public List<Book> afterReadMany(@NotNull List<? extends Book> items) {
        return super.afterReadMany(items);
    }

    @NotNull
    @Override
    public Object afterReadOne(@NotNull Book item) {
        return super.afterReadOne(item);
    }

    @NotNull
    @Override
    public Object afterUpdate(@NotNull Book old, @NotNull Book book) {
        return super.afterUpdate(old, book);
    }

    @NotNull
    @Override
    public Book beforeCreate(@NotNull Book item) {
        return super.beforeCreate(item);
    }

    @Override
    public void beforeDelete(long id) {
        super.beforeDelete(id);
    }

    @NotNull
    @Override
    public Map<String, Pair<String, Object>> beforeReadMany(@NotNull Map<String, ? extends Pair<String, ?>> filters) {
        return super.beforeReadMany(filters);
    }

    @Override
    public void beforeReadOne(long id) {
        super.beforeReadOne(id);
    }

    @NotNull
    @Override
    public Book beforeUpdate(long id, @NotNull Book book) {
        return super.beforeUpdate(id, book);
    }
}
