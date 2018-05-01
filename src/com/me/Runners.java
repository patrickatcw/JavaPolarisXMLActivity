package com.me;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Runners {

    char gender;
    String FirstName;
    String LastName;
    String Race;
    double MinutePerMile;
    double Time;

    public Character getGender() {
        return gender;
    }

    @XmlElement
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return FirstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getMinutePerMile() {
        return MinutePerMile;
    }

    @XmlElement
    public void setMinutePerMile(double minutePerMile) {
        MinutePerMile = minutePerMile;
    }

    public String getRace() {
        return Race;
    }

    @XmlElement
    public void setRace(String race) {
        Race = race;
    }

    public double getTime() {
        return Time;
    }

    @XmlElement
    public void setTime(double time) {
        Time = time;
    }
}
