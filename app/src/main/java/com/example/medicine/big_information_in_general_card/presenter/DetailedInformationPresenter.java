package com.example.medicine.big_information_in_general_card.presenter;

import com.example.medicine.model.Card;
import com.example.medicine.big_information_in_general_card.view.DetailedInformationContract;

public class DetailedInformationPresenter implements DetailedInformationContract.Presenter {

    private DetailedInformationContract.View view;

    public DetailedInformationPresenter(DetailedInformationContract.View view) {
        this.view = view;
    }

    public void onEnterInformation(Card card) {
        view.fillTextWithDataCard(card);
    }
}
