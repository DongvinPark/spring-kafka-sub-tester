package toyproject.springkafkasubtester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<toyproject.springkafkasubtester.entity.Subject, Long> {

}
