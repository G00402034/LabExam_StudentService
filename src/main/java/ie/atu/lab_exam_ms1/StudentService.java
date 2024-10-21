package ie.atu.lab_exam_ms1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {
    private final List<Student>  studentList = new ArrayList<>();

    public Student findByID(Long studentId){
        for(Student student : studentList){
            if(Objects.equals(student.getStudentId(), studentId)) {
                return student;
            }
        }
        return  null;
    }

}
