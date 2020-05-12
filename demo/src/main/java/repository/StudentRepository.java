package repository;

import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
interface StudentRepository extends JpaRepository<Student, Long>{

    Optional<Student> findById(long id);
    List<Student> findAll();
}

