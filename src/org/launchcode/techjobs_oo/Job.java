package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        String jobString;
        String error = "Data not available";
        int anId = this.id;
        String aName = this.name;
        String anEmployer = this.employer.getValue();
        String aLocation = this.location.getValue();
        String aPositionType = this.positionType.getValue();
        String aCoreCompetency = this.coreCompetency.getValue();

        //check for empty fields
        if (aName.equals("")){
            aName = error;
        }

        if (anEmployer.equals("")){
            anEmployer = error;
        }

        if (aLocation.equals("")){
            aLocation = error;
        }

        if (aPositionType.equals("")){
            aPositionType = error;
        }

        if (aCoreCompetency.equals("")){
            aCoreCompetency = error;
        }

        //if all fields are empty, declare an error message. if not, print all fields
        if (aName.equals(error) && anEmployer.equals(error) && aLocation.equals(error) && aPositionType.equals(error) && aCoreCompetency.equals(error)){
            jobString = "\nID: " + anId + "\nOOPS! This job does not seem to exist.";
        } else {
            jobString = "\nID: " + anId + "\nName: " + aName + "\nEmployer: " + anEmployer + "\nLocation: " + aLocation + "\nPosition Type: " + aPositionType + "\nCore Competency: " + aCoreCompetency + "\n";
        }

        return jobString;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
