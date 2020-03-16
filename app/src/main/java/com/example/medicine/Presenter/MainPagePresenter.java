package com.example.medicine.Presenter;

import com.example.medicine.Adapter.CardAdapter;
import com.example.medicine.Interface.MainPageView;
import com.example.medicine.Model.DataImportCards;

public class MainPagePresenter {

    private MainPageView mainPageView;
    private DataImportCards dataImportCards = new DataImportCards();

    public MainPagePresenter(MainPageView mainPageView){
        this.mainPageView = mainPageView;
    }

    public void onRecycleView() {
        final CardAdapter cardAdapter = new CardAdapter();
        cardAdapter.setCardAdapter(dataImportCards.getBaseCardTest(), this);
        mainPageView.initialisationCardsList(cardAdapter);
    }

    public void onBigInformationPage(int idCard)
    {
        mainPageView.startMoreInformationPage(idCard);
    }
}
