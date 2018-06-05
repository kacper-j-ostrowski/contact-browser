package pl.ostrowski.contactbrowser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.ostrowski.contactbrowser.controllers.CategoryRestController;

@SpringBootApplication
public class ContactbrowserApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContactbrowserApplication.class, args);
	}
}
