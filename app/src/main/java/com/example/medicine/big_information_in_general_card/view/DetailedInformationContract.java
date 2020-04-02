package com.example.medicine.big_information_in_general_card.view;

import com.example.medicine.model.Card;

public interface DetailedInformationContract {

    interface View {
        void fillTextWithDataCard(Card card);
    }

    interface Presenter {
        void onEnterInformation(Card card);
    }
}
