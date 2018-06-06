package pl.ostrowski.contactbrowser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ostrowski.contactbrowser.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
