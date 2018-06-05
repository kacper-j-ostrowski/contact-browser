package pl.ostrowski.contactbrowser.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Category {
    @Id
    private Long ID;
    private String name;
    private Long parentID;
}