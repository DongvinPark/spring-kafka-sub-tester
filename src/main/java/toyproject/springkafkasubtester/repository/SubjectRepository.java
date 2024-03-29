package toyproject.springkafkasubtester.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyproject.springkafkasubtester.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<toyproject.springkafkasubtester.entity.Subject, Long> {
  Optional<Subject> findBySubjectId(Long subjectId);
}
