package controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Book {

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public String qry(@PathVariable String id) {
        return "{\"name\": \"unix\"}";
    }
}
