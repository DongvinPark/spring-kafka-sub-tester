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
public class StudentInfoDto {

  private String studentId;

  public static StudentInfoDto fromStudentSubjectMapEntity(
      StudentSubjectMap entity
  ){
    return StudentInfoDto.builder()
        .studentId(entity.getStudentId())
        .build();
  }

}
