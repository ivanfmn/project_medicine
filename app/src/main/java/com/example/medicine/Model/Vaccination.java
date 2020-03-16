package com.example.medicine.Model;

import java.io.Serializable;

public class Vaccination implements Serializable {

    private String nameVaccination;
    private String dateEnter;

    public void setNameVaccination(String nameVaccination) {
        this.nameVaccination = nameVaccination;
    }

    public void setDateEnter(String dateEnter) {
        this.dateEnter = dateEnter;
    }

    public String getNameVaccination() {
        return this.nameVaccination;
    }

    public String getDateEnter() {
        return this.dateEnter;
    }
}
