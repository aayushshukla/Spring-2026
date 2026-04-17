package com.infosys.config;

import com.infosys.beans.Batch;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfig {

    @Bean(name="batch")
    Batch getBatch()
    {
       Batch batch = new Batch();
       batch.setBatchId(1);
       batch.setBatchName("PDA-Batch-1");
       batch.setTotalStudents(26);
       return  batch;
    }
}
