package com.example.medicine.repository;

import com.example.medicine.model.Card;

import java.util.ArrayList;
import java.util.List;

public class CardDataRepository {

    public List<Card> getDataCards(boolean fakeData) {
        if (fakeData) {
            //fake data base
            return createFakeDataCard();
        } else {
            //real data base
            DataBaseHelper dataBaseHelper;
            List<Card> cards = new ArrayList<Card>();
            return cards;
        }
    }

    private List<Card> createFakeDataCard() {
        FakeCardData fake = new FakeCardData();
        return fake.getFakeDataCards();
    }
}
