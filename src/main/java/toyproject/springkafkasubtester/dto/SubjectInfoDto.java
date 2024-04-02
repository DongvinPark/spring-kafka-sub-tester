package toyproject.springkafkasubtester.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import toyproject.springkafkasubtester.entity.StudentSubjectMap;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubjectInfoDto {

  public String subjectName;

  public static SubjectInfoDto fromStudentSubjectMapEntity (
      StudentSubjectMap entity
  ){
    return SubjectInfoDto.builder()
        .subjectName("subject0" + entity.getSubjectId())
        .build();
  }

}
