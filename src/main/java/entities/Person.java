package entities;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.*;
import jakarta.persistence.Entity;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    private int age;
}
