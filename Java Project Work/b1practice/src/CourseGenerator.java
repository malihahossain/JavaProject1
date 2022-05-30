import Models.Course;
import Models.Department;

import java.util.ArrayList;

public class CourseGenerator {

   static ArrayList<Course>csCourseList;
    static ArrayList<Course>bbaCourseList;
    static ArrayList<Course>eeeCourseList;

    static ArrayList<Department>departmentList;

    static {
        csCourseList=new ArrayList<>();
        bbaCourseList=new ArrayList<>();
        eeeCourseList=new ArrayList<>();
        departmentList=new ArrayList<>();

        csCourseList.add(new Course("DLD",3.0));
        csCourseList.add(new Course("Mathematics",3.0));
        csCourseList.add(new Course("Algorithm",3.0));

        bbaCourseList.add(new Course("Marketing",3.0));
        bbaCourseList.add(new Course("Finance",3.0));
        bbaCourseList.add(new Course("Management",3.0));

        eeeCourseList.add(new Course("EMF",3.0));
        eeeCourseList.add(new Course("Control System",3.0));
        eeeCourseList.add(new Course("Data Structure and Algorithm",3.0));

        departmentList.add(new Department("CSE","AR Tower"));
        departmentList.add(new Department("BBA","BBA Building"));
        departmentList.add(new Department("EEE","EEE Building"));


    }







}
