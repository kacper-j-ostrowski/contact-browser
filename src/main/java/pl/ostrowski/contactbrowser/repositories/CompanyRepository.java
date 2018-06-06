package pl.ostrowski.contactbrowser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ostrowski.contactbrowser.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
