package toyproject.springkafkasubtester.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import toyproject.springkafkasubtester.entity.Student;
import toyproject.springkafkasubtester.entity.Subject;
import toyproject.springkafkasubtester.service.ConsumerService;
import toyproject.springkafkasubtester.service.TestService;

@RestController
@RequiredArgsConstructor
public class TestController {

  private final TestService testService;
  private final ConsumerService consumerService;

  @PostMapping("/test-sub/{message}")
  public void testSub(
      @PathVariable String message
      // 예시 메시지 >> name01:0
      // name01 이라는 studentId를 가진 학생이 0번 과목에 수강신청 했다는 의미.
  ){
    consumerService.processMessage(message);
  }

  @GetMapping("/students/{subjectId}")
  public List<Student> getAllStudents(
      @PathVariable Long subjectId
  ){
    return testService.getAllStudentsBySubject(subjectId);
  }

  @GetMapping("/subjects/{studentId}")
  public List<Subject> getAllSubjects(
      @PathVariable Long studentId
  ) {
    return testService.getAllSubjectsByStudentId(studentId);
  }

}
