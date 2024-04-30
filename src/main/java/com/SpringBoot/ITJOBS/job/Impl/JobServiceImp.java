package com.SpringBoot.ITJOBS.job.Impl;

import com.SpringBoot.ITJOBS.job.Job;
import com.SpringBoot.ITJOBS.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class JobServiceImp implements JobService {
    private List<Job> jobs=new ArrayList<>();
    private Long nextId=1L;
    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        for (Job job:jobs) {
            if(job.getId()==id){
                return job;
            }
        }
        return null;
    }
}
