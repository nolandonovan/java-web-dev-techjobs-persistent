package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 1500, message = "Skill's long description cannot be longer than 1,500 characters")
    private String longDescription;

    public Skill(String longDescription) {
        super();
        this.longDescription = longDescription;
    }

    public Skill() {}

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}