package com.infosys.beans;

import org.springframework.stereotype.Component;

@Component
public class Batch {
    public Batch()
    {
        System.out.println("My new Batch !!!!");
    }
    public String  getBatchName()
    {
        return "PDA-Batch1-Spring-1";
    }

}
