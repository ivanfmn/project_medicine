package com.example.medicine.Interface;

import com.example.medicine.Adapter.CardAdapter;

public interface MainPageView {
    void initialisationCardsList(CardAdapter cardAdapter);
    void startMoreInformationPage(int idCard);
}
