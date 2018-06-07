package pl.ostrowski.contactbrowser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ContactbrowserApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContactbrowserApplication.class, args);
	}
}
