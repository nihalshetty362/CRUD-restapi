package com.example.CRUD.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@javax.persistence.Entity
@Data
@javax.persistence.Table(name = "Student")
public class Student {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", length = 64, unique = true)
        private Integer id;

        @Column(name = "student_first_name")
        private String studentFirstName;

        @Column(name = "student_last_name")
        private String studentLastName;

        @Column(name = "DOB")
        private String dob;

        @Column(name = "address")
        private String address;

       
}
