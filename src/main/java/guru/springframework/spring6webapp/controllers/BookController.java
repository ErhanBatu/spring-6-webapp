package guru.springframework.spring6webapp.controllers;


import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    //we can run multiple interface here, this is Spring power
    private final BookService bookService;

    //Spring will automatically call BookServiceImpl
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //Spring will put /books after 8080 and invoke this method
    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookService.findAll());

        //it will return books.html under templates, you don't have to write books.html
        return "books";
    }



}
