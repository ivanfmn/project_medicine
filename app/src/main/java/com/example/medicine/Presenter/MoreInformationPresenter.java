package com.example.medicine.Presenter;

import com.example.medicine.Model.Card;
import com.example.medicine.Model.DataImportCards;
import com.example.medicine.Interface.MoreInformationView;

import java.util.ArrayList;

public class MoreInformationPresenter {

    private DataImportCards DBImport = new DataImportCards();
    private MoreInformationView moreInformationView;

    public MoreInformationPresenter(MoreInformationView moreInformationView) {
        this.moreInformationView = moreInformationView;
    }

    public void onEnterInformation(int ID) {
        ArrayList<Card> allCards = DBImport.getBaseCardTest();
        this.moreInformationView.setText(allCards.get(ID));
    }
}
