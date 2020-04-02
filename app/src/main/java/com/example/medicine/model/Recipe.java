package com.example.medicine.model;

import java.io.Serializable;

public class Recipe implements Serializable {

    private int id;
    private String drugName;
    private String startDate;
    private String endDate;
    private int frequency;
    private float dosage;
    private boolean medicationReminder;
    private boolean drivingCar;
    private boolean alcogolCompatibility;
    private boolean cigareteCompatibility;
    private int dieteLevel;

    public Recipe(Integer id,
                  String drugName,
                  String startDate,
                  String endDate,
                  Integer frequency,
                  Float dosage,
                  Boolean medicationReminder,
                  Boolean drivingCar,
                  Boolean alcogolCompatibility,
                  Boolean cigareteCompatibility,
                  Integer dieteLevel) {
        this.id = id;
        this.drugName = drugName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
        this.dosage = dosage;
        this.medicationReminder = medicationReminder;
        this.drivingCar = drivingCar;
        this.alcogolCompatibility = alcogolCompatibility;
        this.cigareteCompatibility = cigareteCompatibility;
        this.dieteLevel = dieteLevel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDrugName(String name) {
        drugName = name;
    }

    public void setStartEndDate(String start, String end) {
        startDate = start;
        endDate = end;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public void setDosage(Float dosage) {
        this.dosage = dosage;
    }

    public void setReminder(Boolean reminder) {
        medicationReminder = reminder;
    }

    public void setCompabilityAll(Boolean drivingCar, Boolean alcogol, Boolean cigarete, Integer levelDiete) {
        this.drivingCar = drivingCar;
        alcogolCompatibility = alcogol;
        cigareteCompatibility = cigarete;
        this.dieteLevel = levelDiete;
    }

    public String getDrugName() {
        return drugName;
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

    public Integer getDieteLevel() {
        return dieteLevel;
    }
}
