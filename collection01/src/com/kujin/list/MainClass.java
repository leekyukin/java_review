package com.kujin.list;

import java.util.*;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        Student stu = null;
        for(int i = 0; i < 2; i++) {
            stu = new Student();
            stu.inputStuInfo();
            stu.calcTotAvgGrade();
            students.add(stu);
        }

        Point.showPointUI();
        for(Student s : students) {
            s.outputStuInfo();
        }

    }
}
