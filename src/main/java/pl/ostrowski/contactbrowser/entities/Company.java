package pl.ostrowski.contactbrowser.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@Table(name = "companies")
public class Company {
    @Id
    private Long id;
    @Column
    private String companyName;
    @Column
    private String krs;
    private String regon;
    @OneToOne
    private Contact contact;
    @ManyToMany
    @JoinTable(name = "categories_companies",
        joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;
}
