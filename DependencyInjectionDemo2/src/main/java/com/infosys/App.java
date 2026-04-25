package com.infosys;

import com.infosys.beans.Batch;
import com.infosys.beans.Feedback;
import com.infosys.beans.Student;
import com.infosys.beans.Trainer;
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
//        Student student =  context.getBean(Student.class); // get object of student bean
//        student.setStudentName("Aayush");
//        student.setStudentId(1);
//        Batch batch = context.getBean(Batch.class);  // access object of batch bean
//        batch.setBatchId(1);
//        batch.setBatchName("PDA-Batch-1");
//        System.out.println(student.toString());


        Trainer trainer = context.getBean(Trainer.class);
        Feedback feedback = context.getBean(Feedback.class);
        trainer.setTrainerId(1);
        trainer.setTrainerName("Aayush");
        feedback.setAvgFeedbackRatings(4.8);
        feedback.setFeedBackDate("20-04-2026");
        System.out.println(feedback.toString());
    }
}
