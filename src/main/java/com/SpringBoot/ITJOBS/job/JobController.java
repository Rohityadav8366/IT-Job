package com.SpringBoot.ITJOBS.job;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/job")
    public List<Job> findAll()
    {
        return jobService.findAll();
    }
    @PostMapping("/job")
    public String createJob(@RequestBody Job job)
    {
        jobService.createJob(job);
        return "Job added Successfully";
    }

    @GetMapping("/job/{id}")
    public Job getJobById(@PathVariable Long id)
    {
        Job job=jobService.getJobById(id);
        if(job!=null)
            return job;
        return new Job(1L,"TestJob","testJob","2","3lpa","delhi");
    }
}
