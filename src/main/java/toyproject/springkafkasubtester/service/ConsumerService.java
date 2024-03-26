package toyproject.springkafkasubtester.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toyproject.springkafkasubtester.repository.StudentRepository;
import toyproject.springkafkasubtester.repository.StudentSubjectMapRepository;
import toyproject.springkafkasubtester.repository.SubjectRepository;

@Service
@RequiredArgsConstructor
public class ConsumerService {
  private final StudentRepository studentRepository;
  private final SubjectRepository subjectRepository;
  private final StudentSubjectMapRepository studentSubjectMapRepository;

  @Value("${subject.limit}")
  private String MAX_STUDENT_LIMIT;

  @Transactional
  public void processMessage(String kafkaMessage){
    System.out.println("kafkaMessage = " + kafkaMessage);
    // 학생이 저장돼 있지 않으면 학생을 먼저 저장해야 한다.

    // 과목이 저장돼 있지 않다면, 과목을 먼저 저장해야 한다.

    // StudentSubjectMap 엔티티들 중에서 현재 과목번호와 일치하는 엔티티들의 개수를 찾아낸다.
    // 과목에 수강신청 완료한 학생 수가 MAX_STUDENT_LIMIT 보다 작을 때만 StudentSubjectMap에 새로운 엔티티 저장한다.
  }

}
