package com.SpringBoot.ITJOBS.job.Impl;

import com.SpringBoot.ITJOBS.job.Job;
import com.SpringBoot.ITJOBS.job.JobRepository;
import com.SpringBoot.ITJOBS.job.JobService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JobServiceImp implements JobService {
    //private List<Job> jobs=new ArrayList<>();
    JobRepository jobRepository;
    private Long nextId=1L;

    public JobServiceImp(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobRepository.save(job);
    }

    @Override
    public Job getJobById(Long id) {
       return jobRepository.findById(id).orElse(null);

    }

    @Override
    public boolean deletejobById(Long id) {
        try {jobRepository.deleteById(id);
        return true;}
    catch(Exception e){
       return false;
    }
    }

    @Override
    public boolean updateJob(long id, Job updatedJob) {
        Optional<Job> jobOptional=jobRepository.findById(id);
            if(jobOptional.isPresent())
            {
                Job job=jobOptional.get();
                job.setTitle(updatedJob.getTitle());
                job.setDescription(updatedJob.getDescription());
                job.setExperience(updatedJob.getExperience());
                job.setSalary(updatedJob.getSalary());
                job.setLocation(updatedJob.getLocation());
                jobRepository.save(job);
                return true;
            }
        return false;
    }
}
