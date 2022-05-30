package Models;

import java.util.ArrayList;

public class Student {
    private String name;
    private long nid;
    private String phone;

    private Department department;
    private ArrayList<Course> courseList;
    public Student(String name, long nid, String phone) {
        this.name = name;
        this.nid = nid;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNid() {
        return nid;
    }

    public void setNid(long nid) {
        this.nid = nid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nid=" + nid +
                ", phone='" + phone + '\'' +
                ", department=" + department +
                ", courseList=" + courseList +
                '}';
    }
}



