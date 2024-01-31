package com.example.catalogonline.services;

import com.example.catalogonline.model.Teacher;
import com.example.catalogonline.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
//@Service
//        // indic jpa ca aceasta este o clasa de service in care voi crea
//// logica de business a aplicatiei
//public class CategoryService {
//    private CategoryRepository categoryRepository;
//    //injectez been - ul de productCategoryRepository prin constructor
//    //si ma folosesc de adnotarea @autowired
//
//    @Autowired
//    public CategoryService(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }