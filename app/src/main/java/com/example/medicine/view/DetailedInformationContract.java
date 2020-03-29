package com.example.medicine.view;

import com.example.medicine.model.Card;

public interface DetailedInformationContract {

    interface view {
        void fillTextWithDataCard(Card card);
    }

    interface presenter {
        void onEnterInformation(Card card);
    }
}
