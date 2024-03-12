package io.swagger.api;

import io.swagger.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.service.StudentApiService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-08T12:13:16.917553477Z[GMT]")
@RestController
public class StudentApiController implements StudentApi {

    private static final Logger log = LoggerFactory.getLogger(StudentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private StudentApiService studentApiService;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Student>> studentGet() {
        List<Student> student = studentApiService.getAllStudent();

        //String accept = request.getHeader("Accept");
//        if (student != null && student.contains("application/json")) {
//            try {
//                return new ResponseEntity<Student>(objectMapper.readValue("{\n  \"name\" : \"name\",\n  \"course\" : \"course\",\n  \"rollNo\" : 0\n}", Student.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }

        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    public ResponseEntity<Student> studentPost(@Parameter(in = ParameterIn.DEFAULT, description = "structure of Student", required=true, schema=@Schema()) @Valid @RequestBody Student body
) {
        Student students = studentApiService.addStudent(body);
        //String accept = request.getHeader("Accept");
        return new ResponseEntity<>(students,HttpStatus.CREATED);
        //return new ResponseEntity<students>(HttpStatus.NOT_IMPLEMENTED);
    }

    //public ResponseEntity<>

}
