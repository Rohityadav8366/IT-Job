package com.SpringBoot.ITJOBS.job;

import java.util.List;

public interface JobService {

    List<Job> findAll();
    void createJob(Job job);

    Job getJobById(Long id);

    boolean deletejobById(Long id);

    boolean updateJob(long id, Job updatedJob);
}
