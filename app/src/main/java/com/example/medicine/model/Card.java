package com.example.medicine.model;

import java.io.Serializable;
import java.util.List;

public class Card implements Serializable {

    private int id;
    private String doctorName;
    private String doctorSurName;
    private String doctorPatronymicName;
    private String date;
    private String place;
    private boolean receptionRepeated;
    private String receptionRepeatedDate;
    private String serviceName;
    private boolean isVaccination;
    private int vaccinationsAmount;
    private List<Vaccination> vaccinations;
    private boolean isSickLeave;
    private SickLeave sickLeave;

    public Card(Integer id,
                String serviceName,
                String doctorName,
                String doctorSurName,
                String doctorPatronymicName,
                String date,
                String place,
                Boolean receptionRepeated,
                String receptionRepeatedDate,
                Boolean isSickLeave,
                SickLeave sickLeave,
                Boolean isVaccination,
                Integer vaccinationsAmount,
                List<Vaccination> vaccinations) {
        this.id = id;
        this.doctorName = doctorName;
        this.doctorSurName = doctorSurName;
        this.doctorPatronymicName = doctorPatronymicName;
        this.date = date;
        this.place = place;
        this.receptionRepeated = receptionRepeated;
        this.receptionRepeatedDate = receptionRepeatedDate;
        this.serviceName = serviceName;
        this.isVaccination = isVaccination;
        this.vaccinationsAmount = vaccinationsAmount;
        this.vaccinations = vaccinations;
        this.isSickLeave = isSickLeave;
        this.sickLeave = sickLeave;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String name, String surName, String patronymicName) {
        doctorName = name;
        doctorSurName = surName;
        this.doctorPatronymicName = patronymicName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setDateCard(String date) {
        this.date = date;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setReceptionRepeated(Boolean no) {
        receptionRepeated = no;
    }

    public void setRepeatedReception(Boolean yes, String dateRepeatedReception) {
        receptionRepeated = yes;
        this.receptionRepeatedDate = dateRepeatedReception;
    }

    public void setVaccination(Boolean no) {
        isVaccination = no;
    }

    public void setIsVaccination(Boolean yes, List<Vaccination> vaccinations) {
        isVaccination = yes;
        this.vaccinations = vaccinations;
        setVaccinationsAmount(vaccinations);
    }

    public void setSickLeave(Boolean no) {
        isSickLeave = no;
    }

    public void setIsSickLeave(Boolean yes, SickLeave sickleave) {
        isSickLeave = yes;
        sickLeave = sickleave;
    }

    private void setVaccinationsAmount(List<Vaccination> vaccinations) {
        vaccinationsAmount = vaccinations.size();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorSurName() {
        return doctorSurName;
    }

    public String getDoctorPatronymicName() {
        return doctorPatronymicName;
    }

    public String getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public Boolean getReceptionRepeated() {
        return receptionRepeated;
    }

    public String getReceptionRepeatedDate() {
        return receptionRepeatedDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public Boolean getVaccination() {
        return isVaccination;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public Integer getAmountVaccination() {
        return vaccinationsAmount;
    }

    public Boolean getIsSickLeave() {
        return isSickLeave;
    }

    public SickLeave getSickLeave() {
        return sickLeave;
    }
}


