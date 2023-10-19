package com.example.test.model;

public class PersonModel {

    private int id;
    private String name;
    private int age;
    private String surname;
    private String midname;

    public  PersonModel(){}

    public PersonModel(int id, String name, int age, String surname, String midname){
        this.id = id;
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.midname = midname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }
}
