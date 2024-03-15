package toyproject.springkafkasubtester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyproject.springkafkasubtester.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
