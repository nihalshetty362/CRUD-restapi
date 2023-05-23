package com.example.CRUD.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUD.Entity.Student;
import com.example.CRUD.Service.StudentService;

@RestController
@RequestMapping("/student/")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("studentList")
    public Optional<Student> studentList(@RequestParam Integer id) {
        try {
            Optional<Student> a = studentService.getStudent(id);
            return a;
        } catch (Exception ex) {
            throw new Error("ERROR");
        }
    }

    @PostMapping("addStudentList")
    public String addStudentList(@RequestBody Student student) {
        try {
            studentService.addStudent(student);
            return "Student name is Added";
        } catch (Exception ex) {
            throw new Error("ERROR");
        }

    }

    @PutMapping("updateStudentList")
    public String updateStudentList(@RequestParam Integer id, @RequestBody Student student) {
        try {
            studentService.updateStudent(id, student);
            return "Student name is update";
        } catch (Exception ex) {
            throw new Error("ERROR");
        }

    }

    @DeleteMapping("deletStudentList")
    public String deletStudentList(@RequestParam Integer id) {
        try {
            studentService.deletStudent(id);
            return "Student name is deleted";
        } catch (Exception ex) {
            throw new Error("ERROR");
        }

    }

}
