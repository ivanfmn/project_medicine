package com.example.medicine.seakleave.view;

import com.example.medicine.model.MiniCard;

import java.util.List;

public interface SeakLeaveCardsView {
    void setActivity(int idCard, int idThis);
    void showMiniCardsList(List<MiniCard> miniCards);
}
