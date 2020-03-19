package com.example.medicine.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Card implements Serializable {

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


    public Card init() {
        return new Card();
    }

    public void setNumberCard(Integer Number) {
        numberCard = Number;
    }

    public void setFullName(String Name, String SurName, String PatronymicDoctor) {
        nameDoctor = Name;
        surNameDoctor = SurName;
        patronymicDoctor = PatronymicDoctor;
    }

    public void setNameService(String NameService) {
        nameService = NameService;
    }

    public void setDateCard(String Date) {
        date = Date;
    }

    public void setPlace(String Place) {
        place = Place;
    }

    public void setRepeatedReception(Boolean No) {
        repeatedReception = No;
    }

    public void setRepeatedReception(Boolean Yes, String DateRepeatedReception) {
        repeatedReception = Yes;
        dateRepeatedReception = DateRepeatedReception;
    }

    public void setOnVaccination(Boolean No) {
        onVaccination = No;
    }

    public void setOnVaccination(Boolean Yes, List<Vaccination> Vaccinations) {
        onVaccination = Yes;
        vaccinations = Vaccinations;
        setAmountVaccinations(Vaccinations);
    }

    public void setOnSickLeave(Boolean No) {
        onSickLeave = No;
    }

    public void setOnSickLeave(Boolean Yes, SickLeave sickleave) {
        onSickLeave = Yes;
        sickLeave = sickleave;
    }

    private void setAmountVaccinations(List<Vaccination> Vaccinations) {
        amountVaccinations = Vaccinations.size();
    }

    public Integer getNemberCard() {
        return numberCard;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public String getSurNameDoctor() {
        return surNameDoctor;
    }

    public String getPatronymicDoctor() {
        return patronymicDoctor;
    }

    public String getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public Boolean getRepeatedReception() {
        return repeatedReception;
    }

    public String getDateRepeatedReception() {
        return dateRepeatedReception;
    }

    public String getNameService() {
        return nameService;
    }

    public Boolean getOnVaccination() {
        return onVaccination;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public Integer getAmountVaccination() {
        return amountVaccinations;
    }

    public Boolean getOnSickLeave() {
        return onSickLeave;
    }

    public SickLeave getSickLeave() {
        return sickLeave;
    }
}


