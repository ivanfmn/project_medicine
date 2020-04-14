package com.example.medicine.seakleave.presenter;

import com.example.medicine.model.Card;
import com.example.medicine.model.MiniCard;
import com.example.medicine.model.Recipe;
import com.example.medicine.model.Vaccination;
import com.example.medicine.repository.CardDataRepository;
import com.example.medicine.seakleave.view.SeakLeaveCardsView;

import java.util.ArrayList;
import java.util.List;

public class SeakLeavesPresenter {

    private SeakLeaveCardsView seakLeaveCardsView;
    private int idRequest;
    private List<Card> cards;
    private CardDataRepository cardDataRepository = new CardDataRepository();

    public SeakLeavesPresenter(SeakLeaveCardsView seakLeaveCardsView) {
        this.seakLeaveCardsView = seakLeaveCardsView;
        cards = cardDataRepository.getDataCards(true);
    }

    public void setIdRequest(int id) {
        idRequest = id;
    }

    public void initList() {
        seakLeaveCardsView.showMiniCardsList(getSickLeaveForAdapter());
    }

    public void startBigInformationActivity(int idCard, int idThis) {
    }

    private List<MiniCard> getSickLeaveForAdapter() {
        List<MiniCard> miniCards = new ArrayList<>();
        for (Card card : cards) {
            String service = card.getSickLeave().getDiagnosis();
            String fullDate = card.getSickLeave().getStartSickleave() + " - " + card.getSickLeave().getEndSickleave();
            MiniCard miniCard = new MiniCard(service, fullDate, card.getId(), card.getSickLeave().getId());
            miniCards.add(miniCard);
        }
        return miniCards;
    }
}
