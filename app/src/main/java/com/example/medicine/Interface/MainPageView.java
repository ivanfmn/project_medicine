package com.example.medicine.Interface;

import com.example.medicine.Model.Card;

import java.util.List;

public interface MainPageView {
    void initialisationCardsList(List<Card> cards);
    void startMoreInformationPage(Card card);
    void onMoreInformationPresenter(Card card);
}
