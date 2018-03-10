package vn.its.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.its.model.Student;
import vn.its.repository.StudentRepository;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl() {
        super();
        System.out.println("Default Constructor Injection");
    }

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        System.out.println("Constructor Injection");
        this.studentRepository = studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        System.out.println("Setter Injection");
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    }
}
