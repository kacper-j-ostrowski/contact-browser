package pl.ostrowski.contactbrowser.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Company {

    @Id
    private Long id;
    private String companyName;
    private String krs;
    private String regon;

    @OneToOne
    private Contact contact;

    @OneToMany
    private List<Category> categories;
}
