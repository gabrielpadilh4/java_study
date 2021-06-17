package com.github.gabrielpadilh4.model.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SS")
public class ScholarshipStudent extends Student {

    private double scholarshipValue;

    public ScholarshipStudent() {

    }

    public ScholarshipStudent(Long registration, String name, Double scholarshipValue) {
        super(registration, name);
        this.scholarshipValue = scholarshipValue;
    }

    public double getScholarshipValue() {
        return scholarshipValue;
    }

    public void setScholarshipValue(double scholarshipValue) {
        this.scholarshipValue = scholarshipValue;
    }
}
