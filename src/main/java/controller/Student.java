package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class Student {

    Logger logger = LoggerFactory.getLogger(Student.class);

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public String qryStudent(@PathVariable String id) {
        logger.debug("id {}", id);
        return "{\"name\": \"xj\"";
    }
}
