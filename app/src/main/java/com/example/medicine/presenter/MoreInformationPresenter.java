package com.example.medicine.presenter;

import com.example.medicine.model.Card;
import com.example.medicine.model.DataImportCards;
import com.example.medicine.view.DetailedInformationActivity;

public class MoreInformationPresenter {

    private DataImportCards DBImport = new DataImportCards();
    private DetailedInformationActivity detailedInformationActivity;

    public MoreInformationPresenter(DetailedInformationActivity detailedInformationActivity) {
        this.detailedInformationActivity = detailedInformationActivity;
    }

    public void onEnterInformation(Card card) {
        detailedInformationActivity.fillTextWithDataCard(card);
    }
}
