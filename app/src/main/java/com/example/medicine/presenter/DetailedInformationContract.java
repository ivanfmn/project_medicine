package com.example.medicine.presenter;

import com.example.medicine.model.Card;
import com.example.medicine.view.DetailedInformationContract;

public class DetailedInformationContract implements com.example.medicine.view.DetailedInformationContract.presenter {

    private com.example.medicine.view.DetailedInformationContract.view view;

    public DetailedInformationContract(com.example.medicine.view.DetailedInformationContract.view view) {
        this.view = view;
    }

    public void onEnterInformation(Card card) {
        view.fillTextWithDataCard(card);
    }
}
