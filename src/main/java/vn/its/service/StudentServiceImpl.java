package vn.its.service;

import org.springframework.beans.factory.annotation.Autowired;
import vn.its.model.Student;
import vn.its.repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService {
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

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        System.out.println("Setter Injection");
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    }
}
