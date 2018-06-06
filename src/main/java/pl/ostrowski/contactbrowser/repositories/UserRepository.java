package pl.ostrowski.contactbrowser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ostrowski.contactbrowser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
