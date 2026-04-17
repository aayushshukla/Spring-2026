package com.infosys;


import com.infosys.beans.Student;
import com.infosys.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Student student= context.getBean(Student.class);
        student.setStudentName("Abishek");
        student.setStudentId(102);
        System.out.println(student.toString());
    }
}
