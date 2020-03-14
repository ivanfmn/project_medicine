package com.example.medicine.Model;

import java.util.ArrayList;
import java.util.List;

public class Card {

    private Integer numberCard;
    private String nameDoctor;
    private String surNameDoctor;
    private String patronymicDoctor;
    private String date;
    private String place;
    private Boolean repeatedReception;
    private String dateRepeatedReception;
    private String nameService;
    private Boolean onVaccination;
    private Integer amountVaccinations;
    private List<Vaccination> vaccinations;
    private Boolean onSickLeave;
    private SickLeave sickLeave;


    public Card init(){
        return new Card();
    }

    public void setNumberCard(Integer Number){
        this.numberCard = Number;
    }

    public void setFullName(String Name, String SurName, String PatronymicDoctor){
        this.nameDoctor = Name;
        this.surNameDoctor = SurName;
        this.patronymicDoctor = PatronymicDoctor;
    }

    public void setNameService(String NameService){
        this.nameService = NameService;
    }

    public void setDateCard(String Date){
        this.date = Date;
    }

    public void setPlace(String Place){
        this.place = Place;
    }

    public void setRepeatedReception(Boolean No){
        this.repeatedReception = No;
    }

    public void setRepeatedReception(Boolean Yes, String DateRepeatedReception){
        this.repeatedReception = Yes;
        this.dateRepeatedReception = DateRepeatedReception;
    }

    public void setOnVaccination(Boolean No){
        this.onVaccination = No;
    }

    public void setOnVaccination(Boolean Yes, ArrayList<Vaccination> Vaccinations){
        this.onVaccination = Yes;
        this.vaccinations = Vaccinations;
        this.setAmountVaccinations(Vaccinations);
    }

    public void setOnSickLeave(Boolean No){
        this.onSickLeave = No;
    }

    public void setOnSickLeave(Boolean Yes, SickLeave sickleave){
        this.onSickLeave = Yes;
        this.sickLeave = sickleave;
    }

    private void setAmountVaccinations(ArrayList<Vaccination> Vaccinations){
        this.amountVaccinations = Vaccinations.size();
    }

    public Integer getNemberCard(){
        return this.numberCard;
    }

    public String getNameDoctor(){
        return this.nameDoctor;
    }

    public String getSurNameDoctor(){
        return this.surNameDoctor;
    }

    public String getPatronymicDoctor(){
        return this.patronymicDoctor;
    }

    public String getDate(){
        return this.date;
    }

    public String getPlace(){
        return this.place;
    }

    public String getRepeatedReception(){
        return returnString(this.repeatedReception);
    }

    public String getDateRepeatedReception(){
        if(this.repeatedReception){
            return this.dateRepeatedReception;
        }
        else
            return "";
    }

    public String getNameService(){
        return this.nameService;
    }

    public String getOnVaccination(){
        return returnString(this.onVaccination);
    }

    public List<Vaccination> getVaccinations(){
        return this.vaccinations;
    }

    public Integer getAmountVaccination(){
        return this.amountVaccinations;
    }

    public String getOnSickLeave(){
        return returnString(this.onSickLeave);
    }

    public SickLeave getSickLeave(){
        return this.sickLeave;
    }

    private String returnString(Boolean its){
        if (its){
            return "Yes";
        }
        else
            return  "No";
    }
}


