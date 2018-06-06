package pl.ostrowski.contactbrowser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ostrowski.contactbrowser.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
}
