package ie.atu.lab_exam_ms1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository <Student, Long> {
}
