package com.example.medicine.Model;

import java.io.Serializable;

public class Recipe implements Serializable {

    private Integer numberRecipe;
    private String nameDrug;
    private String startDate;
    private String endDate;
    private Integer frequency;
    private Float dosage;
    private Boolean medicationReminder;
    private Boolean drivingCar;
    private Boolean alcogolCompatibility;
    private Boolean cigareteCompatibility;
    private Integer levelDiete;


    public void setNameDrug(String Name) {
        nameDrug = Name;
    }

    public void setStartEndDate(String start, String end) {
        startDate = start;
        endDate = end;
    }

    public void setFrequency(Integer Frequency) {
        frequency = Frequency;
    }

    public void setDosage(Float Dosage) {
        dosage = Dosage;
    }

    public void setReminder(Boolean Reminder) {
        medicationReminder = Reminder;
    }

    public void setCompabilityAll(Boolean DrivingCar, Boolean Alcogol, Boolean Cigarete, Integer LevelDiete) {
        drivingCar = DrivingCar;
        alcogolCompatibility = Alcogol;
        cigareteCompatibility = Cigarete;
        levelDiete = LevelDiete;
    }

    public String getNameDrug() {
        return nameDrug;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public Float getDosage() {
        return dosage;
    }

    public Boolean getReminder() {
        return medicationReminder;
    }

    public Boolean getDrivingCar() {
        return drivingCar;
    }

    public Boolean getAlcogolCompatibility() {
        return alcogolCompatibility;
    }

    public Boolean getCigareteCompatibility() {
        return cigareteCompatibility;
    }

    public Integer getLevelDiete() {
        return levelDiete;
    }
}
