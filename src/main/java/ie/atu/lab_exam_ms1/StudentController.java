package ie.atu.lab_exam_ms1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> studentList = new ArrayList<>();
    private StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/student/{id}") {

        public ResponseEntity <List> findStudent(@PathVariable Long studentId ){
            List<Student> studentList = studentService.findByID(studentId);
        }
    }

}
