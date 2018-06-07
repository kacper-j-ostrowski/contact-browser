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
    public void whenNoSearchValue_ReturnAllRecords(){
        Page<Company> foundCompanies = companyService.searchCompaniesByString("", null);
        assertEquals(22L, foundCompanies.getTotalElements());
    }

    @Test
    public void whenKrzysztof_ReturnTwoRecords(){
        Page<Company> foundCompanies = companyService.searchCompaniesByString("Krzysztof", null);
        assertEquals(2L, foundCompanies.getTotalElements());
    }


    @Test
    public void whenRandom_ReturnNothing(){
        Page<Company> foundCompanies = companyService.searchCompaniesByString("dgfhdsnakjlfg8dyufdgfnruio34y8jkj8U*U(U**#", null);
        assertEquals(0L, foundCompanies.getTotalElements());
    }


    @Test
    public void whenNull_ReturnAllRecords(){
        Page<Company> foundCompanies = companyService.searchCompaniesByString(null, null);
        assertEquals(22L, foundCompanies.getTotalElements());
    }

    @Test
    public void whenStwo_ReturnFifteen() {
        Page<Company> foundCompanies = companyService.searchCompaniesByString("stwo", null);
        assertEquals(14L, foundCompanies.getTotalElements());
    }

    @Test
    public void whenPartOfKRSOrREGON_ReturnAll() {
        Page<Company> foundCompanies = companyService.searchCompaniesByString("342", null);
        assertEquals(22L, foundCompanies.getTotalElements());
    }
}