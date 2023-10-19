package com.example.test.model;

public class OrganizationModel {

    private int id;
    private String name;
    private int number;
    private String address;
    private int inn;

    public OrganizationModel(){}

    public OrganizationModel(int id, String name, int number, String address, int inn){
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
        this.inn = inn;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }
}
