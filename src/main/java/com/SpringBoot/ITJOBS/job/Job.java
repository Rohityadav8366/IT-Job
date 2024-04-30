package com.SpringBoot.ITJOBS.job;

public class Job {

    private long id;
    private String title;
    private String description;
    private String experience ;
    private String salary;
    private String location;

    public Job(long id, String title, String description, String experience, String salary, String location) {
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

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
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
