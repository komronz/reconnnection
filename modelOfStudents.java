package com.rekemuz.reconnnection;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Scanner;
public class modelOfStudents {
    private Long id;
    private String name;
    private String surname;
    private String father_name; //optional
    private int _class;
    private String course;
    //todo entering of students
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public int get_class() {
        return _class;
    }

    public void set_class(int _class) {
        this._class = _class;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}