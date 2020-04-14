package com.example.medicine.model;

import java.io.Serializable;

public class MiniCard implements Serializable {

    private String service;
    private String date;
    private int idCard;
    private int idThis;

    public MiniCard(String service, String date, Integer idCard, Integer idThis) {
        this.service = service;
        this.date = date;
        this.idCard = idCard;
        this.idThis = idThis;
    }

    public String getService() {
        return service;
    }
    public String getDate() {
        return date;
    }
    public int getIdCard() {
        return idCard;
    }
    public int getIdThis() {
        return idThis;
    }
}
