package com.example.subjectregportal.ServiceLayer;

import com.example.subjectregportal.Entity.Student;
import com.example.subjectregportal.Response.LoginResponse;
import com.example.subjectregportal.StudentNotFoundException;
import com.example.subjectregportal.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private StudentRepo studentRepo;

    public StudentServiceImp(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student saveStudent(Student student) {
        student.setPassword(passwordEncoder.encode(student.getPassword()));
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getSt() {
        System.out.println("1");
        return studentRepo.findAll();
    }
//
    @Override
    public Student stbyId(Long id) {
        System.out.println("2");
        Optional<Student> st=studentRepo.findById(id);
        if (st.isPresent()){
            return st.get();
        }else {
            throw new StudentNotFoundException("Student","regid",id);
        }
    }
//
    @Override
    public Student update(Student student, Long id) {
        studentRepo.findById(id);
        studentRepo.findById(id).orElseThrow(()
                -> new StudentNotFoundException("Student","regid",id));
        studentRepo.save(student);
        return student;
    }
//
    @Override
    public void delete(Long id) {
        studentRepo.findById(id).orElseThrow(()
                ->new StudentNotFoundException("Student","regid",id));
        studentRepo.deleteById(id);
    }

    @Override
    public LoginResponse loginstudent(LoginDto loginDto) {
        String msg="";
        Student student=studentRepo.findByEmail(loginDto.getEmail());
        if(student!=null){
            String password=loginDto.getPassword();
            String encodepassword=student.getPassword();
            Boolean isPwdRight=passwordEncoder.matches(password,encodepassword);
            if(isPwdRight){
                System.out.println(loginDto.getEmail());
                System.out.println(loginDto.getPassword());
                Optional<Student>student1=studentRepo.findOneByEmailAndPassword(loginDto.getEmail(),encodepassword);
                System.out.println(student1);
                if(student1.isPresent()){
                    return new LoginResponse("login successfully",true);
                }
                else{
                    return new LoginResponse("login failed",false);
                }
            }
            else {
                return new LoginResponse("password not  match",false);
            }
        }
        else {
            return new LoginResponse("email not match",false);
        }

    }
}
