package pl.ostrowski.contactbrowser.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ostrowski.contactbrowser.entities.Category;

import java.util.Collections;
import java.util.List;

@RestController
public class CategoryRestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/category")
    public List<Category> categories() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return Collections.emptyList();
    }

}
