package model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Set;

@Entity
@Table(name = "student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "student")
    private Set<Note> notes;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<Note> getNotes() {
        return notes;
    }
    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }



    public Student(Long id, String name, Set<Note> notes) {
        this.id = id;
        this.name = name;
        this.notes = notes;
    }
}
