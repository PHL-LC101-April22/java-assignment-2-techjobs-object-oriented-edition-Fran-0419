package org.launchcode.techjobs.oo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
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

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
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
    public String toString(){
        //If a field is empty, the method should add, “Data not available” after the label.
        String theReturn;
        int Aid;
        String aName;
        String aEmployer;
        String aLocation;
        String aPosition;
        String aCoreComp;

        if (getName() == null || getName().equals("")){
            aName = "Data not available";}else{aName = getName();}

        if (getEmployer() == null || getEmployer().getValue().equals("")){
            aEmployer = "Data not available";}else{aEmployer = getEmployer().getValue();}

        if (getLocation() == null || getLocation().getValue().equals("")){
            aLocation = "Data not available";}else{aLocation = getLocation().getValue();}

        if (getPositionType() == null || getPositionType().getValue().equals("")){
            aPosition = "Data not available";}else{aPosition = getPositionType().getValue();}

        if (getCoreCompetency() == null|| getCoreCompetency().getValue().equals("")){

            aCoreComp = "Data not available";}else{aCoreComp = getCoreCompetency().getValue();}


        if(getId()== 1 && getName() == null && getEmployer()== null && getLocation()== null && getPositionType() == null && getCoreCompetency()== null){
            theReturn = "OOPS! This job does not seem to exist.";
        } else {
            theReturn = String.format(
                            "\nID: %s" +
                            "\nName: %s" +
                            "\nEmployer: %s" +
                            "\nLocation: %s" +
                            "\nPosition Type: %s" +
                            "\nCore Competency: %s\n",getId(), aName, aEmployer, aLocation, aPosition, aCoreComp);
        }

        return theReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id );
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
