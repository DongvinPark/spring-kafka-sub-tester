package toyproject.springkafkasubtester.service;

import lombok.RequiredArgsConstructor;
import toyproject.springkafkasubtester.repository.StudentRepository;
import toyproject.springkafkasubtester.repository.StudentSubjectMapRepository;
import toyproject.springkafkasubtester.repository.SubjectRepository;

@RequiredArgsConstructor
public class ConsumerService {
  private final StudentRepository studentRepository;
  private final SubjectRepository subjectRepository;
  private final StudentSubjectMapRepository studentSubjectMapRepository;

  public void processMessage(String kafkaMessage){

  }

}
