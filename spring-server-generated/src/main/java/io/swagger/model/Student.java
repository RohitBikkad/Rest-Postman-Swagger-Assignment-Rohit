package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Student
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-08T12:13:16.917553477Z[GMT]")

@Entity
public class Student   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("course")
  private String course = null;

  @Id
  @JsonProperty("rollNo")
  private Integer rollNo = null;

  public Student name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student course(String course) {
    this.course = course;
    return this;
  }

  /**
   * Get course
   * @return course
   **/
  @Schema(description = "")
  
    public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public Student rollNo(Integer rollNo) {
    this.rollNo = rollNo;
    return this;
  }

  /**
   * Get rollNo
   * @return rollNo
   **/
  @Schema(description = "")
  
    public Integer getRollNo() {
    return rollNo;
  }

  public void setRollNo(Integer rollNo) {
    this.rollNo = rollNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.name, student.name) &&
        Objects.equals(this.course, student.course) &&
        Objects.equals(this.rollNo, student.rollNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, course, rollNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    rollNo: ").append(toIndentedString(rollNo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
