package org.example.librarymanagementsystem;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BooksController {
private final BookRepository bookRepository; // it must be intiated other wise it will show the error

public BooksController(BookRepository bookRepository){
    this.bookRepository = bookRepository;
}

    @GetMapping
    public List<Books> getBooks(){
return bookRepository.findAll();

    }

    @PostMapping
    public Books addBooks(@RequestBody Books book){
    return bookRepository.save(book);
    }


}
