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


    public void setNameDrug(String Name)
    {
        this.nameDrug = Name;
    }

    public void setStartEndDate(String start, String end)
    {
        this.startDate = start;
        this.endDate = end;
    }

    public void setFrequency(Integer Frequency)
    {
        this.frequency = Frequency;
    }

    public void setDosage(Float Dosage)
    {
        this.dosage = Dosage;
    }

    public void setReminder(Boolean Reminder)
    {
        this.medicationReminder = Reminder;
    }

    public void setCompabilityAll(Boolean DrivingCar, Boolean Alcogol, Boolean Cigarete, Integer LevelDiete)
    {
        this.drivingCar = DrivingCar;
        this.alcogolCompatibility = Alcogol;
        this.cigareteCompatibility = Cigarete;
        this.levelDiete = LevelDiete;
    }

    public String getNameDrug()
    {
        return this.nameDrug;
    }
    public String getStartDate()
    {
        return this.startDate;
    }
    public String getEndDate()
    {
        return this.endDate;
    }
    public Integer getFrequency()
    {
        return this.frequency;
    }
    public Float getDosage()
    {
        return this.dosage;
    }
    public Boolean getReminder()
    {
        return this.medicationReminder;
    }
    public Boolean getDrivingCar()
    {
        return this.drivingCar;
    }
    public Boolean getAlcogolCompatibility()
    {
        return this.alcogolCompatibility;
    }
    public Boolean getCigareteCompatibility()
    {
        return this.cigareteCompatibility;
    }
    public Integer getLevelDiete()
    {
        return this.levelDiete;
    }
}
