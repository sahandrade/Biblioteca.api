package web.biblioteca.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class hello {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello world";
    }
    
}
