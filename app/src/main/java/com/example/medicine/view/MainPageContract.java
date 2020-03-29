package com.example.medicine.view;

import com.example.medicine.model.Card;

import java.util.List;

public interface MainPageContract {

    interface View {
        void showCardsList(List<Card> cards);
        void startMoreInformationPage(Card card);
        void startRVSPage(int idRequest);
    }

    interface Presenter {
        void onRecycleView();
        void onBigInformationPage(Card card);
        void onRVSActivity(int idRequest);
    }
}
