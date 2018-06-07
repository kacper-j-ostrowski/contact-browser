package pl.ostrowski.contactbrowser.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.ostrowski.contactbrowser.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query(value = "select c1 from Company c1 JOIN c1.contact c2 WHERE " +
            "lower(unaccent(c1.companyName)) like lower(CONCAT('%', unaccent( :keyword ), '%')) or " +
            "lower(c1.krs) like lower(CONCAT('%', :keyword, '%')) or " +
            "lower(c1.regon) like lower(CONCAT('%', :keyword, '%')) or " +
            "lower(unaccent(c2.name)) like lower(CONCAT('%', unaccent( :keyword ), '%')) or " +
            "lower(unaccent(c2.lastName)) like lower(CONCAT('%', unaccent( :keyword ), '%'))")
    Page<Company> findByKeyword(@Param("keyword") String keyword, Pageable pageable);
}