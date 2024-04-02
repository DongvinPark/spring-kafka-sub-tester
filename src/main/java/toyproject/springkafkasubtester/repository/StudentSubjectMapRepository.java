package toyproject.springkafkasubtester.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import toyproject.springkafkasubtester.entity.StudentSubjectMap;

@Repository
public interface StudentSubjectMapRepository extends JpaRepository<StudentSubjectMap, Long> {

  @Query(
      value = "select count(*) from student_subject_map as ssm where ssm.subject_id = :subject_id_input",
      nativeQuery = true
  )
  Integer getNumberOfRequestedStudents(
      @Param("subject_id_input") Integer subjectId
  );

  List<StudentSubjectMap> findAllBySubjectId(Long subjectId);

  List<StudentSubjectMap> findAllByStudentId(String studentId);

}