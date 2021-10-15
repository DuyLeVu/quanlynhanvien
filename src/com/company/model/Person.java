package com.company.model;

public abstract class Person {
    private int id;
    private String name;
    private String company = "C08 Group";

    public Person(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public Person() {
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
