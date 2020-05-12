package repository;

import model.Note;
import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
interface NoteRepository extends JpaRepository<Note, Long>{

    Optional<Note> findById(long id);
    List<Note> findAll();
    Optional<Note> findByStudent_Id(Student student);

}
