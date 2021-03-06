package com.github.gabrielpadilh4.model.inheritance;

import javax.persistence.*;

@Entity
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // default strategy
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("ST")
public class Student {

    @Id
    private Long registration;

    private String name;

    public Student() {
    }

    public Student(Long registration, String name) {
        this.registration = registration;
        this.name = name;
    }

    public Long getRegistration() {
        return registration;
    }

    public void setRegistration(Long registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
