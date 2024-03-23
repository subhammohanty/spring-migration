package com.example.springmigration.controller;

import com.example.springmigration.entity.Teacher;
import com.example.springmigration.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }

    @GetMapping("/{id}")
    public Teacher getBYId(@PathVariable int id){
        return teacherService.getById(id);
    }

    @PostMapping
    public Teacher save(@RequestBody Teacher teacher){
        return teacherService.save(teacher);
    }
}
