package entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int phoneNumber;
    private String email;
    private String address;
    private String status;
    private LocalDate localdate;
}
