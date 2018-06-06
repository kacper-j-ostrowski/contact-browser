package pl.ostrowski.contactbrowser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.ostrowski.contactbrowser.entities.Company;
import pl.ostrowski.contactbrowser.services.CompanyService;

@RestController
public class CompanyRestController {

    private CompanyService companyService;

    @Autowired
    public CompanyRestController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping(value="companies", method = RequestMethod.GET)
    Page<Company> searchCompanies(@RequestParam(name = "searchText") String searchText, Pageable pageable) {
        return companyService.searchCompaniesByString(searchText, pageable);
    }
}
