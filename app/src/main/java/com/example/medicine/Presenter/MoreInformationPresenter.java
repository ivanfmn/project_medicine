package com.example.medicine.Presenter;

import com.example.medicine.Model.Card;
import com.example.medicine.Model.DataImportCards;
import com.example.medicine.Interface.MoreInformationView;

public class MoreInformationPresenter {

    private DataImportCards DBImport = new DataImportCards();
    private MoreInformationView moreInformationView;

    public MoreInformationPresenter(MoreInformationView moreInformationView) {
        this.moreInformationView = moreInformationView;
    }

    public void onEnterInformation(Card card) {
        moreInformationView.fillTextWithDataCard(card);
    }
}
