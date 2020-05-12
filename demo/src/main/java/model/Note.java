package model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "notes")

public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne(fetch = FetchType.EAGER)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Double value;

    @NotBlank
    //@ManyToOne(fetch = FetchType.EAGER)
    private String description;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }



    public Note(Long id, Double value, String description, Student student) {
        this.id = id;
        this.value = value;
        this.description = description;
        this.student = student;
    }
}
