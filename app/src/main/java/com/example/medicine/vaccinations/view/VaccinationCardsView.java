package com.example.medicine.vaccinations.view;

import com.example.medicine.model.MiniCard;

import java.util.List;

public interface VaccinationCardsView {
    void setActivity(int idCard, int idThis);
    void showMiniCardsList(List<MiniCard> miniCards);
}
