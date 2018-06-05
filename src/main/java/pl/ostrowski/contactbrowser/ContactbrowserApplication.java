package pl.ostrowski.contactbrowser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import pl.ostrowski.contactbrowser.controllers.CategoryRestController;

@SpringBootApplication
@EnableCaching
public class ContactbrowserApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContactbrowserApplication.class, args);
	}
}
