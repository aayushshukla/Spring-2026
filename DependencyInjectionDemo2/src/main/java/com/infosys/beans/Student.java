package com.infosys.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int studentId;
    private String studentName;
    private Batch batch;

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

    public Batch getBatch() {
        return batch;
    }
    @Autowired
    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", batch=" + batch.getBatchName()+
                '}';
    }

//    public static void main(String[] args) {
//        Student student = new Student();
//        student.setStudentId(1);
//        student.setStudentName("Aayush");
//        Batch batch1 = new Batch();
//        batch1.setBatchName("PDA-Batch1");
//        batch1.setBatchId(1);
//        student.setBatch(batch1);
//        System.out.println(student.toString());
//    }
}
