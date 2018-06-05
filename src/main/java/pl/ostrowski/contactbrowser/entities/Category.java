package pl.ostrowski.contactbrowser.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Category {
    @Id
    private Long ID;
    private String name;
    private Long parentID;
    @Transient
    private List<Category> subCategories;
}