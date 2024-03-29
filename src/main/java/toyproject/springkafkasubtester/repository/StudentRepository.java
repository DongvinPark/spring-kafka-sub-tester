package toyproject.springkafkasubtester.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyproject.springkafkasubtester.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
  Optional<Student> findByStudentId(String studentId);
}
