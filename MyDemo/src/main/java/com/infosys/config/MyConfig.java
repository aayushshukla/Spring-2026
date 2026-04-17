package com.infosys.config;

import com.infosys.beans.Student;
import org.springframework.context.annotation.*;
/*
  Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to
  generate bean definitions and service requests for those beans at runtime,


 */

@Configuration
@Import({NewConfig.class}) // Indicates one or more component classes to import — typically @Configuration classes.
public class MyConfig {
   // @Bean  it will indicate to spring container  that this method produce an object that has to be manage by spring container
    @Bean(value ="OldStudent" ) // value is alias for name
    Student getStudent()
    {
        Student s = new Student();  // creating object of student class
        s.setStudentName("Om");  // set the properties of student
        s.setRollNo(21);
        return  s;   // returning student object
    }
   // The name of this bean, or if several names, a primary bean name plus aliases.
    @Bean(name="NewStudent")
    @Primary // this is my default
    Student getNewStudent()
    {
        Student s = new Student();
        s.setStudentName("Akash");
        s.setRollNo(5);
        return  s;
    }

    @Bean({"NewStudent2","RecentStudent","VasuBean"}) // multiple names to a single bean
    @Description("Giving multi ple names to the same bean")  // @Description text help us in knowing what bean does
    Student getNewStudent2()
    {
        Student s = new Student();
        s.setStudentName("Vasu");
        s.setRollNo(15);
        return  s;
    }

}
