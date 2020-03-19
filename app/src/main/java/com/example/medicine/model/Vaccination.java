package com.example.medicine.model;

import java.io.Serializable;

public class Vaccination implements Serializable {

    private String nameVaccination;
    private String dateEnter;

    public void setNameVaccination(String nameVac) {
        nameVaccination = nameVac;
    }

    public void setDateEnter(String date) {
        dateEnter = dateEnter;
    }

    public String getNameVaccination() {
        return nameVaccination;
    }

    public String getDateEnter() {
        return dateEnter;
    }
}
