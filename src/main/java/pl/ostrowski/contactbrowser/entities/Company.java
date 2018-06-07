package pl.ostrowski.contactbrowser.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
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
    @Lazy
    @ManyToMany
    @JoinTable(name = "categories_companies",
        joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", krs='" + krs + '\'' +
                ", regon='" + regon + '\'' +
                ", contact=" + contact +
                '}';
    }
}
