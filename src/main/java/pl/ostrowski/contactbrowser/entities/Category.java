package pl.ostrowski.contactbrowser.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
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
    List<Company> companies;
    @Transient
    private List<Category> subCategories;
}