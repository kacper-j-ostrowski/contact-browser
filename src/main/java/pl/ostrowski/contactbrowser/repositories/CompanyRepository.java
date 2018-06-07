package pl.ostrowski.contactbrowser.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.ostrowski.contactbrowser.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query(value = "select c1, c2 from Company c1 JOIN c1.contact c2 WHERE lower(c1.companyName) like lower(CONCAT('%', :keyword, '%'))")
    Page<Company> findByKeyword(@Param("keyword") String keyword, Pageable pageable);
}