package com.example.medicine.Interface;

import com.example.medicine.Adapter.CardAdapter;
import com.example.medicine.Model.Card;

import java.util.ArrayList;
import java.util.List;

public interface CardsListView {

    void initialisationCardsList(CardAdapter cardAdapter);
    void startBigInformation(int position);
}
