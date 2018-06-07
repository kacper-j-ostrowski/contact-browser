package pl.ostrowski.contactbrowser.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "contacts")
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String contactPhone;
    @Column
    private String position;
}