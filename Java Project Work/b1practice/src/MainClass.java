import Models.Course;
import Models.Department;
import Models.Student;

import java.util.ArrayList;
import java.util.Scanner;



public class MainClass {
    public static void main(String[] args) {

        ArrayList<Student>students=new ArrayList<>();
        ArrayList<Department>department=new ArrayList<>();

        System.out.println("Enter no of Student");
        Scanner sc=new Scanner(System.in);
        int noOfStudent=sc.nextInt();
        for (int i=1;i<=noOfStudent;i++)
        {
            System.out.println("Student "+i+" info:");
            System.out.println("---------------");
            System.out.println("Enter name: ");
            String name=sc.next();
            System.out.println("Enter NID:");
            int NID=sc.nextInt();
            System.out.println("Enter Phone");
            String phone=sc.next();
            Student s=new Student(name,NID,phone);
            System.out.println("Department: ");
            System.out.println("-----------------");

            System.out.println("1.CSE");
            System.out.println("2.BBA");
            System.out.println("3.EEE");
            System.out.println("Select One: ");
            int selection=sc.nextInt();
            switch (selection){
                case 1:
                    s.setDepartment(CourseGenerator.departmentList.get(0));
                    s.setCourseList(CourseGenerator.csCourseList);
                    break;


                case 2:
                    s.setDepartment(CourseGenerator.departmentList.get(1));
                    s.setCourseList(CourseGenerator.bbaCourseList);
                    break;


                case 3:
                    s.setDepartment(CourseGenerator.departmentList.get(0));
                    s.setCourseList(CourseGenerator.eeeCourseList);
                    break;
            }


         students.add(s);

        }
        System.out.println("--------------");
        System.out.println("Total Students");
        for(Student s:students)
        {
            System.out.println(s);
        }




}}
