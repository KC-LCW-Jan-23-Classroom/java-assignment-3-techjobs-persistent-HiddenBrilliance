package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    @JoinColumn(name = "job_id")
   private List<Skill> skills;

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.



    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills.toString();
    }

    public void setSkills(List skills) {
        this.skills = skills;
    }
}
