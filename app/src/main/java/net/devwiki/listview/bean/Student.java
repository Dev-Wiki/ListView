package net.devwiki.listview.bean;

import java.io.Serializable;

/**
 * 学生
 * Created by Administrator on 2016/1/3 0003.
 */
public class Student implements Serializable {

    private String name;

    private int sex;

    private String myClassId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMyClassId() {
        return myClassId;
    }

    public void setMyClassId(String myClassId) {
        this.myClassId = myClassId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", myClassId='" + myClassId + '\'' +
                '}';
    }
}
