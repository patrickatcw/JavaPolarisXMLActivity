package com.me;

//step 1 class
public class MarathonItem {

    //step 2 fields
    private String FirstName;
    private String LastName;
    private String Race;
    private String MinutePerMile;
    private String TimeInMarathon;
    private String Gender;

    //overloading methods
    public MarathonItem(){

        FirstName = "";
        LastName = "";
        Race = "";
        MinutePerMile = "";
        TimeInMarathon = "";
        Gender = "";
    }

    public MarathonItem(String firstName, String lastName, String race, String minutePerMile, String timeInMarathon, String gender) {
        FirstName = firstName;
        LastName = lastName;
        Race = race;
        MinutePerMile = minutePerMile;
        TimeInMarathon = timeInMarathon;
        Gender = gender;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public String getMinutePerMile() {
        return MinutePerMile;
    }

    public void setMinutePerMile(String minutePerMile) {
        MinutePerMile = minutePerMile;
    }

    public String getTimeInMarathon() {
        return TimeInMarathon;
    }

    public void setTimeInMarathon(String timeInMarathon) {
        TimeInMarathon = timeInMarathon;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
