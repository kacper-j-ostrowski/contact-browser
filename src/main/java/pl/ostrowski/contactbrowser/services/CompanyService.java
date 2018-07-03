package pl.ostrowski.contactbrowser.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.ostrowski.contactbrowser.entities.Company;
import pl.ostrowski.contactbrowser.repositories.CompanyRepository;

import java.util.Optional;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public boolean addCompany(Company c) {
        if(c == null) {
            return false;
        }
        Company saved = companyRepository.save(c);
        return saved != null;
    }

    public void deleteCompany(Company c) {
        if(c == null) {
            return;
        }
        companyRepository.delete(c);
    }

    public boolean editCompany(Company c) {
        if(c == null) {
            return false;
        }
        Company saved = companyRepository.save(c);
        return saved != null;
    }

    public Optional<Company> getCompany(Long id) {
        return companyRepository.findById(id);
    }

    public Page<Company> searchCompaniesByString(String searchText, Pageable pageable) {
        if(searchText == null) {
            searchText = "";
        }
        return companyRepository.findByKeyword(searchText, pageable);
    }
}
