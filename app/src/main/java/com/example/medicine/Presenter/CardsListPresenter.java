package com.example.medicine.Presenter;

import com.example.medicine.Adapter.CardAdapter;
import com.example.medicine.Interface.CardsListView;
import com.example.medicine.Model.Card;
import com.example.medicine.Model.DataImportCards;

import java.util.ArrayList;
import java.util.List;

public class CardsListPresenter {

    private CardsListView cardsListView;
    private DataImportCards dataImportCards = new DataImportCards();

    public CardsListPresenter(CardsListView cardsListView){
        this.cardsListView = cardsListView;
    }

    public void onRecycleView() {
        final CardAdapter cardAdapter = new CardAdapter();
        cardAdapter.setCardAdapter(dataImportCards.getBaseCardTest(), this);
        cardsListView.initialisationCardsList(cardAdapter);
    }

    public void onBigInformation(int id) {
        cardsListView.startBigInformation(id);
    }
}
