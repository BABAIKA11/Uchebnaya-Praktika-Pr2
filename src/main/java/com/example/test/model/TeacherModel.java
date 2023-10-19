package com.example.test.model;

public class TeacherModel {

    private int id;
    private String fio;
    private int age;
    private int workExperience;
    private String type;

    public  TeacherModel(){}

    public TeacherModel(int id, String fio, int age, int workExperience, String type){
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.workExperience = workExperience;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
