package yxc.bean;

import java.util.List;

public class ClassName {
    private List<Student> students;
    private List<Teacher> teachers;
    private String name;
    private Integer personNums;

    public Integer getPersonNums() {
        return personNums;
    }

    public void setPersonNums(Integer personNums) {
        this.personNums = personNums;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

