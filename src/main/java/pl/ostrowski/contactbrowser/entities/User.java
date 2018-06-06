package pl.ostrowski.contactbrowser.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private Long id;

    private String firstname;
    private String lastname;

    private String username;
    private String password;

    private String role;
}