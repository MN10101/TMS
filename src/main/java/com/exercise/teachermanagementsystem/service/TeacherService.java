package com.exercise.teachermanagementsystem.service;

import com.exercise.teachermanagementsystem.dao.TeacherRepository;
import com.exercise.teachermanagementsystem.entity.Teacher;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService implements TeacherServiceInterface{

    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository tRepository){

        teacherRepository = tRepository;
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Teacher findById(int id) {
        Optional<Teacher> result = teacherRepository.findById(id);
        Teacher teacher = null;

        if(result.isPresent()){
            teacher = result.get();
        }else{throw new RuntimeException("Teacher id not found - " + id);
        }
        return teacher;
    }

    @Override
    @Transactional
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    @Transactional
    public void deleteByID(int id) {
        teacherRepository.deleteById(id);
    }


}
