package com.example.medicine.vaccinations.presenter;

import com.example.medicine.model.Card;
import com.example.medicine.model.MiniCard;
import com.example.medicine.model.Recipe;
import com.example.medicine.model.Vaccination;
import com.example.medicine.repository.CardDataRepository;
import com.example.medicine.vaccinations.view.VaccinationCardsView;

import java.util.ArrayList;
import java.util.List;

public class VaccinationsPresenter {

    private VaccinationCardsView vaccinationCardsView;
    private List<Card> cards;
    private CardDataRepository cardDataRepository = new CardDataRepository();

    public VaccinationsPresenter(VaccinationCardsView vaccinationCardsView) {
        this.vaccinationCardsView = vaccinationCardsView;
        cards = cardDataRepository.getDataCards(true);
    }

    public void initList() {
        vaccinationCardsView.showMiniCardsList(getVaccinationForAdapter());
    }

    public void startBigInformationActivity(int idCard, int idThis) {

    }
    private List<MiniCard> getVaccinationForAdapter() {
        List<MiniCard> miniCards = new ArrayList<>();
        for (Card card : cards) {
            for (Vaccination vaccination : card.getVaccinations()) {
                String service = vaccination.getVaccinationName();
                String fullDate = vaccination.getEnterDate();
                MiniCard miniCard = new MiniCard(service, fullDate, card.getId(), vaccination.getId());
                miniCards.add(miniCard);
            }
        }
        return miniCards;
    }
}
