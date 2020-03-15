package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    public Employer(String location) {
        super();
        this.location = location;
    }

    public Employer() {}

    @NotBlank
    @Size(max = 100, message = "Location must be less than 100 characters long.")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
