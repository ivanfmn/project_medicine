package com.example.medicine.model;

import java.io.Serializable;

public class Vaccination implements Serializable {

    private int id;
    private String vaccinationName;
    private String enterDate;

    public Vaccination(int id,
                       String vaccinationName,
                       String enterDate) {
        this.id = id;
        this.vaccinationName = vaccinationName;
        this.enterDate = enterDate;
    }

    public void setVaccinationName(String vaccinationName) {
        this.vaccinationName = vaccinationName;
    }

    public void setEnterDate(String date) {
        enterDate = enterDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getVaccinationName() {
        return vaccinationName;
    }

    public String getEnterDate() {
        return enterDate;
    }
}
