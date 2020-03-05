package com.example.medicine.Model;

public class Recipe{

    private Integer NumberRecipe;

    private String NameDrug;
    private String StartDate;
    private String EndDate;
    private Integer Frequency;
    private Float Dosage;
    private Boolean MedicationReminder;
    private Boolean DrivingCar;
    private Boolean AlcogolCompatibility;
    private Boolean CigareteCompatibility;
    private Integer LevelDiete;


    public void SetNameDrug(String Name)
    {
        this.NameDrug = Name;
    }

    public void SetStartEndDate(String start, String end)
    {
        this.StartDate = start;
        this.EndDate = end;
    }

    public void SetFrequency(Integer Frequency)
    {
        this.Frequency = Frequency;
    }

    public void SetDosage(Float Dosage)
    {
        this.Dosage = Dosage;
    }

    public void SetReminder(Boolean Reminder)
    {
        this.MedicationReminder = Reminder;
    }

    public void SetCompabilityAll(Boolean DrivingCar, Boolean Alcogol, Boolean Cigarete, Integer LevelDiete)
    {
        this.DrivingCar = DrivingCar;
        this.AlcogolCompatibility = Alcogol;
        this.CigareteCompatibility = Cigarete;
        this.LevelDiete = LevelDiete;
    }

    public String GetNameDrug()
    {
        return this.NameDrug;
    }
    public String GetStartDate()
    {
        return this.StartDate;
    }
    public String GetEndDate()
    {
        return this.EndDate;
    }
    public Integer GetFrequency()
    {
        return this.Frequency;
    }
    public Float GetDosage()
    {
        return this.Dosage;
    }
    public Boolean GetReminder()
    {
        return this.MedicationReminder;
    }
    public Boolean GetDrivingCar()
    {
        return this.DrivingCar;
    }
    public Boolean GetAlcogolCompatibility()
    {
        return this.AlcogolCompatibility;
    }
    public Boolean GetCigareteCompatibility()
    {
        return this.CigareteCompatibility;
    }
    public Integer GetLevelDiete()
    {
        return this.LevelDiete;
    }
}
