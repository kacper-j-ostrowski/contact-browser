package pl.ostrowski.contactbrowser.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.ostrowski.contactbrowser.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query(value = "select * from companies comp join contacts ct on comp.contact_id = ct.id " +
            "where comp.company_name like '% ?1 %' or comp.krs like '% ?1 %' or comp.regon like '% ?1 %' or " +
            "ct.last_name like '% ?1 %' or ct.name like '% ?1 %'",
            countQuery = "select count(*) from companies comp join contacts ct on comp.contact_id = ct.id " +
                    "where comp.company_name like '% ?1 %' or comp.krs like '% ?1 %' or comp.regon like '% ?1 %' or " +
                    "ct.last_name like '% ?1 %' or ct.name like '% ?1 %'",
            nativeQuery = true)
    Page<Company> findByKeyword(String keyword, Pageable pageable);
}