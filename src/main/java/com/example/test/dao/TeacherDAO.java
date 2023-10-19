package com.example.test.dao;

import com.example.test.model.PersonModel;
import com.example.test.model.TeacherModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherDAO {

    private static int TEACHER_COUNT;
    private List<TeacherModel> teacher;
    {
        teacher = new ArrayList<>();

        teacher.add(new TeacherModel(++TEACHER_COUNT,"Баранников А.А.",18, 3,"Учитель математики"));
        teacher.add(new TeacherModel(++TEACHER_COUNT,"Улесов И.П.",18, 4,"Учитель истории"));
        teacher.add(new TeacherModel(++TEACHER_COUNT,"Рыжов А.С.",18, 5,"Учитель русского языка"));
        teacher.add(new TeacherModel(++TEACHER_COUNT,"Поверин Н.О.",18, 6,"Учитель экономики"));
    }

    public List<TeacherModel> index(){

        return teacher;
    }

    public TeacherModel show(int id){
        return teacher.stream().filter(teacherModel -> teacherModel.getId() == id).findAny().orElse(null);
    }

    public void save(TeacherModel teach){
        teach.setId(++TEACHER_COUNT);
        teacher.add(teach);
    }

    public void update(int id, TeacherModel teacherModel){
        TeacherModel updateTeacher = show(id);
        updateTeacher.setFio(teacherModel.getFio());
        updateTeacher.setAge(teacherModel.getAge());
        updateTeacher.setWorkExperience(teacherModel.getWorkExperience());
        updateTeacher.setType(teacherModel.getType());
    }


    public void delete(int id){
        teacher.removeIf(p-> p.getId() == id);
    }

}
