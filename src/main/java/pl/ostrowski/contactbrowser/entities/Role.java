package pl.ostrowski.contactbrowser.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Role {
    @Id
    private String code;
    private String name;
}