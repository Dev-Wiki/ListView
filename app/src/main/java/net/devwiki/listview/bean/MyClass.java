package net.devwiki.listview.bean;

import java.util.List;

/**
 * 班级类
 * Created by Administrator on 2016/1/3 0003.
 */
public class MyClass {

    private String name;

    private int index;

    private String id;

    private String gradeId;

    private List<Student> studentList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                ", name='" + name + '\'' +
                ", index=" + index +
                ", id='" + id + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
