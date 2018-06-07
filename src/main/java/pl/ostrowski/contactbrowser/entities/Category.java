package pl.ostrowski.contactbrowser.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class Category {
    @Id
    private Long ID;
    @Column
    private String name;
    @Column
    private Long parentID;
    @ManyToMany
    @JoinTable(name = "categories_companies",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id"))
    List<Company> companies;
    @Transient
    private List<Category> subCategories;
}