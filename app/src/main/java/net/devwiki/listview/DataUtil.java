package net.devwiki.listview;

import net.devwiki.listview.bean.MyClass;
import net.devwiki.listview.bean.Grade;

import java.util.List;

/**
 * 用于制造数据
 * Created by Administrator on 2016/1/3 0003.
 */
public class DataUtil {

    public static Grade getGrade(){
        Grade school = new Grade();
        school.setName("七年级");
        school.setId("201507");
        return school;
    }

    public static List<MyClass> getMyClassList(Grade grade){
        for (int i = 1; i < 10; i++) {
            MyClass myClass = new MyClass();
            myClass.setId("2015070" + i);
            myClass.setName("class-" + i);
            myClass.setIndex(i);
            myClass.setGradeId(grade.getId());
        }
    }
}
