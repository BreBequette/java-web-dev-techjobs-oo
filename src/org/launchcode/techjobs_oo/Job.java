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
        String anEmployer = this.employer.toString();
        String aLocation = this.location.toString();
        String aPositionType = this.positionType.toString();
        String aCoreCompetency = this.coreCompetency.toString();

        //check for empty fields
        if (aName == ""){
            aName = error;
        }

        if (anEmployer == null){
            anEmployer = error;
        }

        if (aLocation == null){
            aLocation = error;
        }

        if (aPositionType == null){
            aPositionType = error;
        }

        if (aCoreCompetency == null){
            aCoreCompetency = error;
        }

        //if all fields are empty, declare an error message. if not, print all fields
//        if (aName == error && anEmployer == error && aLocation == error && aPositionType == error && aCoreCompetency == error){
//            jobString = "OOPS! This job does not seem to exist.";
//        } else {
//            jobString = "\nID: " + anId + "\nName: " + aName + "\nEmployer: " + anEmployer + "\nLocation: " + aLocation + "\nPosition Type: " + aPositionType + "\nCore Competency: " + aCoreCompetency + "\n";
//        }

        jobString = "\nID: " + anId + "\nName: " + aName + "\nEmployer: " + anEmployer + "\nLocation: " + aLocation + "\nPosition Type: " + aPositionType + "\nCore Competency: " + aCoreCompetency + "\n";

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
