package com.CRUD_Operation_Uttam.CRUD_Operation.Controller;

import com.CRUD_Operation_Uttam.CRUD_Operation.Model.Student;
import com.CRUD_Operation_Uttam.CRUD_Operation.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        studentRepository.save(student);

    }
    @GetMapping("/fetchStudent")
    public List<Student> fetchStudent(){
        return studentRepository.findAll();

    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable Integer id){
       return studentRepository.findById(id).orElse(null);

    }

    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody Student student){

        Student data=studentRepository.findById(student.getRoll()).orElse(null);
        System.out.println(data);
        if(data!=null){
            data.setName(student.getName());
            data.setAddress(student.getAddress());
            studentRepository.save(data);

        }
    }


    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentRepository.deleteById(id);

    }



}
