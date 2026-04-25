package com.infosys.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int rollNo;
    private String studentName;
    // field injection it is not recommended
    @Autowired
    // Batch batch = new Batch()
    private  Batch batch;  // student class is dependent on batch class


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



    public void studentDetails()
    {
        System.out.println(" Student name "+studentName
        );

        System.out.println(" Student name "+rollNo
        );
        System.out.println("Batch name"+batch.getBatchName());
    }


}
