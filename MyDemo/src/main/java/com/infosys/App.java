package com.infosys;

import com.infosys.beans.Batch;
import com.infosys.beans.Student;
import com.infosys.config.MyConfig;
import com.infosys.config.NewConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // creating spring container
        // telling spring to use MyConfig.class as configuration source
       // AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(MyConfig.class);

        // To use multiple config files
        // way 1
       // AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(MyConfig.class, NewConfig.class);
         // way 2 : use @Import({Anotherconfig files to import}) in config file
        // @Import({MyConfig.class , Config2.class ,...})
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(MyConfig.class);

        // getBean () - Return the bean instance that uniquely matches the given object type, if any

        System.out.println("====== Using Primary Bean =================");
        Student student5 = context.getBean(Student.class);
        System.out.println("Student name "+student5.getStudentName());
        System.out.println(" Student rollno"+student5.getRollNo());
        System.out.println(student5.toString());

        System.out.println("=========================================");

        // Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        //No qualifying bean of type 'com.infosys.beans.Student' available: expected single matching bean but found 2:

        // to resolve  NoUniqueBeanDefinitionException: there are different ways
        // 1 . give name to beans
        // 2. @Primary  it make bean default
         Student student =   context.getBean("OldStudent",Student.class);
        System.out.println("Student name "+student.getStudentName());
        System.out.println(" Student rollno"+student.getRollNo());
        System.out.println(student.toString());

        Student student1 =   context.getBean("NewStudent",Student.class);
        System.out.println("Student name "+student1.getStudentName());
        System.out.println(" Student rollno"+student1.getRollNo());
        System.out.println(student1.toString());

        Student student2 =   context.getBean("NewStudent2",Student.class);
        System.out.println("Student name "+student2.getStudentName());
        System.out.println(" Student rollno"+student2.getRollNo());
        System.out.println(student2.toString());

        Student student3 =   context.getBean("VasuBean",Student.class);
        System.out.println("Student name "+student3.getStudentName());
        System.out.println(" Student rollno"+student3.getRollNo());
        System.out.println(student3.toString());

        Batch batch =  context.getBean("batch",Batch.class); // getting batch bean from another config file name as NewConfig
        System.out.println(batch.toString());
    }
}
