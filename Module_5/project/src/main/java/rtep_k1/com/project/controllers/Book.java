package rtep_k1.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Book {
    @GetMapping("/Book")
    public String BookStore()
    {
        return "Book";
    }
}
