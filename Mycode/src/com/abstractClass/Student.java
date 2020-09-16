package com.abstractClass;

public abstract class Student {
    private String name;
    abstract public void study();
    abstract public void exam();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Student(String name) {
        this.name = name;
    }
    Student(){}

}
