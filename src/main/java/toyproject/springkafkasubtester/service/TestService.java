package toyproject.springkafkasubtester.service;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import toyproject.springkafkasubtester.dto.StudentInfoDto;
import toyproject.springkafkasubtester.dto.SubjectInfoDto;
import toyproject.springkafkasubtester.entity.Student;
import toyproject.springkafkasubtester.entity.Subject;
import toyproject.springkafkasubtester.repository.StudentSubjectMapRepository;

@Service
@RequiredArgsConstructor
public class TestService {

  private final StudentSubjectMapRepository studentSubjectMapRepository;

  public List<StudentInfoDto> getAllStudentsBySubject(Long subjectId){
    return studentSubjectMapRepository.findAllBySubjectId(subjectId)
        .stream().map(StudentInfoDto::fromStudentSubjectMapEntity)
        .collect(Collectors.toList());
  }

  public List<SubjectInfoDto> getAllSubjectsByStudentId(String studentId){
    return studentSubjectMapRepository.findAllByStudentId(studentId)
        .stream().map(SubjectInfoDto::fromStudentSubjectMapEntity)
        .collect(Collectors.toList());
  }

}
