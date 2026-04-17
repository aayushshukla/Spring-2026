package com.infosys.beans;

import org.springframework.stereotype.Component;

@Component
// it is class level annotation
// it is stereotype annotation
// it make process of creating and registering bean to spring context easy with less amount of code to write .
// by applying this Spring automatically detects and manages the spring bean
public class Student {

    private int studentId;
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
