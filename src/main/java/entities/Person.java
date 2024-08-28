package entities;

import jakarta.persistence.Entity;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity

public class Person {

    private int id;
    private String name;
    private int age;
}
