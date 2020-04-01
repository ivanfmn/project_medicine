package com.example.medicine.main_page.presenter;

import com.example.medicine.main_page.view.MainPageContract;
import com.example.medicine.repository.CardDataRepository;
import com.example.medicine.model.Card;

public class MainPagePresenter implements MainPageContract.Presenter {

    private MainPageContract.View view;
    private CardDataRepository cardDataRepository = new CardDataRepository();

    public MainPagePresenter(MainPageContract.View view) {
        this.view = view;
    }

    public void onRecycleView() {
        view.showCardsList(cardDataRepository.getDataCards(true));
    }

    public void onBigInformationPage(Card card) {
        view.startMoreInformationPage(card);
    }

    public void onRecipeActivity() {
        view.startRecipeActivity();
    }

    public void onSeakLeaveActivity() {
        view.startSeakLeaveActivity();
    }

    public void onVaccinationActivity() {
        view.startVaccinationActivity();
    }
}
