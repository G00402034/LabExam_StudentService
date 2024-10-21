package ie.atu.lab_exam_ms1;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequestMapping("/student")
public class StudentService {
    private StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo){this.studentRepo = studentRepo;}

    @GetMapping("/{id}")
    public List<Student>(Student student){
        StudentRepo.save(student)
                return studentRepo.findAll();
    }


}

