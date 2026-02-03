package com.example.buoi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.buoi3.model.Book;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private static List<Book> bookList = new ArrayList<>();
    private static int currentId = 1;

    static {
        bookList.add(new Book(currentId++, "Thép Chúi Đã Tôi Thế Đấy", "Ostrovski"));
        bookList.add(new Book(currentId++, "Ngược Dòng Vẫn Về", "Nguyễn Nhật Ánh"));
    }

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookList);
        return "books";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @PostMapping("/add")
    public String addBook(@RequestParam("title") String title, 
                         @RequestParam("author") String author) {
        Book newBook = new Book(currentId++, title, author);
        bookList.add(newBook);
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        Book book = bookList.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("book", book);
        return "edit-book";
    }

    @PostMapping("/edit")
    public String editBook(@RequestParam("id") int id,
                          @RequestParam("title") String title,
                          @RequestParam("author") String author) {
        Book book = bookList.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
        }
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        bookList.removeIf(b -> b.getId() == id);
        return "redirect:/books";
    }
}
