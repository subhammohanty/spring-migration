package com.example.springmigration.service;

import com.example.springmigration.entity.Teacher;
import com.example.springmigration.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;

    public List<Teacher> getAll(){
        return teacherRepo.findAll();
    }

    public Teacher getById(int id){
        return teacherRepo.findById(id).get();
    }

    public Teacher save(Teacher teacher){
        return teacherRepo.save(teacher);
    }
}
