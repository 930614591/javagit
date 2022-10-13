package com.li.controller;

import com.li.domain.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save (@RequestBody Book book){
        System.out.println("book save ...ok");
        return "{'module':'book.save'}";
    }
    @DeleteMapping("/{id}")
    public String delete (@PathVariable Integer id){
        System.out.println("book save ...ok");
        return "{'module':'book.delete'}";
    }
    @PutMapping
    public String put (@RequestBody Book book){
        System.out.println("book save ...ok");
        return "{'module':'book.put'}";
    }
    @GetMapping("/{id}")
    public String getvyid (@PathVariable Integer id){
        System.out.println("book save ...ok");
        return "{'module':'book.getbyid'}";
    }
}
