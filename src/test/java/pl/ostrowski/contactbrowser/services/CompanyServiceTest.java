package pl.ostrowski.contactbrowser.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;
import pl.ostrowski.contactbrowser.entities.Company;
import pl.ostrowski.contactbrowser.repositories.CompanyRepository;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class CompanyServiceTest {

    @Autowired
    private CompanyRepository companyRepository;

    private CompanyService companyService;

    @Before
    public void init() {
        companyService = new CompanyService(companyRepository);
    }

    @Test
    public void run() {
        Page<Company> foundCompanies = companyService.searchCompaniesByString("wla", null);
        assertEquals(1L, foundCompanies.getTotalElements());
    }

}