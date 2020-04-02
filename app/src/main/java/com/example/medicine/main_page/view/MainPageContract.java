package com.example.medicine.main_page.view;

import com.example.medicine.model.Card;

import java.util.List;

public interface MainPageContract {

    interface View {
        void showCardsList(List<Card> cards);
        void startMoreInformationPage(Card card);
        void startRecipeActivity();
        void startSeakLeaveActivity();
        void startVaccinationActivity();
    }

    interface Presenter {
        void onRecycleView();
        void onBigInformationPage(Card card);
        void onRecipeActivity();
        void onSeakLeaveActivity();
        void onVaccinationActivity();
    }
}
