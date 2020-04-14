package com.example.medicine.recipes.view;

import com.example.medicine.model.MiniCard;

import java.util.List;

public interface RecipeCardsView {
    void setActivity(int idCard,int idThis);
    void showMiniCardsList(List<MiniCard> miniCards);
}
