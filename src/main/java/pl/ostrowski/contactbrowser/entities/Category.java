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
@Table(name = "categories")
public class Category {
    @Id
    private Long ID;
    @Column
    private String name;
    @Column
    private Long parentID;
    @Lazy
    @Transient
    private List<Category> subCategories;
    @Lazy
    @ManyToMany
    @JoinTable(name = "categories_companies",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id"))
    private List<Company> companies;

    @Override
    public String toString() {
        return "Category{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", parentID=" + parentID +
                '}';
    }
}