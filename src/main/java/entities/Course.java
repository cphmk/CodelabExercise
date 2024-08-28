package entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "teacher_ID")
    private int teacherID;
    @Column(name = "classroom")
    private String classroom;
    @Column(name = "time")
    private LocalDate time;


    // name of the course, the teacher, the semester, the classroom, the time of the course and whatever you think is relevant.
}
