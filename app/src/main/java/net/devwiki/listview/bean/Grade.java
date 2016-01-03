package net.devwiki.listview.bean;

import java.io.Serializable;

/**
 * 学校类
 * Created by Administrator on 2016/1/3 0003.
 */
public class Grade implements Serializable {

    private String name;

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
