package com.infosys.beans;


import org.springframework.stereotype.Component;

@Component
public class Trainer {

    private  int trainerId;
    private  String trainerName;

    public  Trainer()
    {}

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", trainerName='" + trainerName + '\'' +
                '}';
    }
}
