package com.example.medicine.view;

import com.example.medicine.model.Card;

import java.util.List;

public interface MainPageActivity {
    void showCardsList(List<Card> cards);
    void startMoreInformationPage(Card card);
    void onMoreInformationPresenter(Card card);
}
