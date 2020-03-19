package com.example.medicine.presenter;

import com.example.medicine.view.MainPageActivity;
import com.example.medicine.model.Card;
import com.example.medicine.model.DataImportCards;

public class MainPagePresenter {

    private MainPageActivity mainPageActivity;
    private DataImportCards dataImportCards = new DataImportCards();

    public MainPagePresenter(MainPageActivity mainPageActivity) {
        this.mainPageActivity = mainPageActivity;
    }

    public void onRecycleView() {

        mainPageActivity.showCardsList(dataImportCards.getBaseCardTest());
    }

    public void onBigInformationPage(Card card) {
        mainPageActivity.startMoreInformationPage(card);
    }
}
