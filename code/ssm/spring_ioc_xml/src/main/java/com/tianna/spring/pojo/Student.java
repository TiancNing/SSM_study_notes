package com.tianna.spring.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * @author tiancn
 * @date 2022/8/5 17:22
 */
public class Student {
    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private String[] hobby;
    private Clazz clazz;

    private Map<String,Object> teacherMap;

    public Student() {
    }

    public Student(Integer sid, String sname, Integer age, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }

    public Map<String, Object> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Object> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", clazz=" + clazz +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
