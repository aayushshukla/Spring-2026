package com.infosys.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Feedback {

    private String feedBackDate;
    private  double avgFeedbackRatings;
    private  Trainer trainer;


    @Autowired  // constructor injection
    public Feedback( Trainer trainer) {
        this.trainer = trainer;
    }

    public double getAvgFeedbackRatings() {
        return avgFeedbackRatings;
    }

    public void setAvgFeedbackRatings(double avgFeedbackRatings) {
        this.avgFeedbackRatings = avgFeedbackRatings;
    }

    public String getFeedBackDate() {
        return feedBackDate;
    }

    public void setFeedBackDate(String feedBackDate) {
        this.feedBackDate = feedBackDate;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedBackDate='" + feedBackDate + '\'' +
                ", avgFeedbackRatings=" + avgFeedbackRatings +
                ", trainer=" + trainer.toString() +
                '}';
    }

    // new Feeback("12-april-2026",4.8,new Trainer(1,"Aayush"))
}
