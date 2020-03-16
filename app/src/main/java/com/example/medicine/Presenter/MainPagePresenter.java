package com.example.medicine.Presenter;

import com.example.medicine.Adapter.CardAdapter;
import com.example.medicine.Interface.MainPageView;
import com.example.medicine.Model.Card;
import com.example.medicine.Model.DataImportCards;

public class MainPagePresenter {

    private MainPageView mainPageView;
    private DataImportCards dataImportCards = new DataImportCards();

    public MainPagePresenter(MainPageView mainPageView){
        this.mainPageView = mainPageView;
    }

    public void onRecycleView() {

        mainPageView.initialisationCardsList(dataImportCards.getBaseCardTest());
    }

    public void onBigInformationPage(Card card)
    {
        mainPageView.startMoreInformationPage(card);
    }
}
