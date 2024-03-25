package toyproject.springkafkasubtester.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import toyproject.springkafkasubtester.entity.Student;
import toyproject.springkafkasubtester.entity.Subject;

@Service
@RequiredArgsConstructor
public class TestService {

  public List<Student> getAllStudentsBySubject(Long subjectId){
    return null;
  }

  public List<Subject> getAllSubjectsByStudentId(Long studentId){
    return null;
  }

}
