package toyproject.springkafkasubtester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyproject.springkafkasubtester.entity.StudentSubjectMap;

@Repository
public interface StudentSubjectMapRepository extends JpaRepository<StudentSubjectMap, Long> {

}
