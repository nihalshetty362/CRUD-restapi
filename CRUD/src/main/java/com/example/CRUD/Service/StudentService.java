package com.example.CRUD.Service;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUD.Entity.Student;
import com.example.CRUD.Repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Optional<Student> getStudentList( Integer id){
        Optional<Student>student=studentRepo.findById(id);
        return student;
    }

    public Optional<Student> getStudent(Integer id) {
        return getStudentList(id);
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public void updateStudent(Integer id,Student student) {
       Optional<Student> s1 =getStudentList(id);
        if(s1==null){
            System.out.println("inavalid id");
        }
        else{
            s1.get().setAddress(student.getAddress());
            s1.get().setDob(student.getDob());
            s1.get().setStudentFirstName(student.getStudentFirstName());
            s1.get().setStudentLastName(student.getStudentLastName());
            studentRepo.save(s1);
        }


    }

    public void deletStudent(Integer id) {
        Optional<Student>s2=getStudentList(id);
        if(s2==null){
            System.out.println("inavalid id");
        }
        else{
        studentRepo.deleteById(id);
        }
    }
    
}
