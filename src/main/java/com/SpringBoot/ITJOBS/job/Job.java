package com.SpringBoot.ITJOBS.job;

import jakarta.persistence.*;

@Entity
//@Table(name="job_table")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private int experience ;
    private String salary;
    private String location;

    public Job() {
    }

    public Job(long id, String title, String description, int experience, String salary, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.experience = experience;
        this.salary = salary;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
