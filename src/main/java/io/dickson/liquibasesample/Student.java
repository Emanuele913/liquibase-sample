package io.dickson.liquibasesample;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    public Student() {
        // For persistence
    }

    public Student(String name) {
        this.name = name;
    }
}
