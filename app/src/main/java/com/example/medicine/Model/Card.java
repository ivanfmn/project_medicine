package com.example.medicine.Model;

import java.util.ArrayList;

public class Card {

    private Integer NumberCard;
    private String NameDoctor;
    private String SurNameDoctor;
    private String PatronymicDoctor;
    private String Date;
    private String Place;
    private Boolean RepeatedReception;
    private String DateRepeatedReception;
    private String NameService;
    private Boolean OnVaccination;
    private Integer AmountVaccinations;
    private ArrayList<Vaccination> Vaccinations;
    private Boolean OnSickLeave;
    private SickLeave sickleave;


    public Card Init()
    {
        return new Card();
    }
    public void SetNumberCard(Integer Number)
    {
        this.NumberCard = Number;
    }
    public void SetFullName(String Name, String SurName, String PatronymicDoctor)
    {
        this.NameDoctor = Name;
        this.SurNameDoctor = SurName;
        this.PatronymicDoctor = PatronymicDoctor;
    }
    public void SetNameService(String NameService)
    {
        this.NameService = NameService;
    }
    public void SetDateCard(String Date)
    {
        this.Date = Date;
    }
    public void SetPlace(String Place)
    {
        this.Place = Place;
    }
    public void SetRepeatedReception(Boolean No)
    {
        this.RepeatedReception = No;
    }
    public void SetRepeatedReception(Boolean Yes, String DateRepeatedReception)
    {
        this.RepeatedReception = Yes;
        this.DateRepeatedReception = DateRepeatedReception;
    }
    public void SetOnVaccination(Boolean No)
    {
        this.OnVaccination = No;
    }
    public void SetOnVaccination(Boolean Yes, ArrayList<Vaccination> Vaccinations)
    {
        this.OnVaccination = Yes;
        this.Vaccinations = Vaccinations;
        this.SetAmountVaccinations(Vaccinations);
    }
    public void SetOnSickLeave(Boolean No)
    {
        this.OnSickLeave = No;
    }
    public void SetOnSickLeave(Boolean Yes, SickLeave sickleave)
    {
        this.OnSickLeave = Yes;
        this.sickleave = sickleave;
    }

    private void SetAmountVaccinations(ArrayList<Vaccination> Vaccinations)
    {
        this.AmountVaccinations = Vaccinations.size();
    }

    public Integer GetNemberCard()
    {
        return this.NumberCard;
    }
    public String GetNameDoctor()
    {
        return this.NameDoctor;
    }
    public String GetSurNameDoctor()
    {
        return this.SurNameDoctor;
    }
    public String GetPatronymicDoctor()
    {
        return this.PatronymicDoctor;
    }
    public String GetDate()
    {
        return this.Date;
    }
    public String GetPlace()
    {
        return this.Place;
    }
    public String GetRepeatedReception()
    {
        if (this.RepeatedReception)
        {
            return "Yes";
        }
        else
            return  "No";
    }
    public String GetDateRepeatedReception()
    {
        if(this.RepeatedReception)
        {
            return this.DateRepeatedReception;
        }
        else
            return "";

    }
    public String GetNameService()
    {
        return this.NameService;
    }
    public String GetOnVaccination()
    {
        if (this.OnVaccination)
        {
            return "Yes";
        }
        else
            return  "No";
    }
    public ArrayList<Vaccination> GetVaccinations()
    {
        return this.Vaccinations;
    }
    public Integer GetAmountVaccination()
    {
        return this.AmountVaccinations;
    }
    public String GetOnSickLeave()
    {
        if (this.OnSickLeave)
        {
            return "Yes";
        }
        else
            return  "No";
    }
    public SickLeave GetSickLeave()
    {
        return this.sickleave;
    }
}


