package pl.ostrowski.contactbrowser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ostrowski.contactbrowser.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
