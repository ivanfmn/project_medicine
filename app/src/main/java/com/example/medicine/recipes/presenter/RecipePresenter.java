package com.example.medicine.recipes.presenter;

import com.example.medicine.model.Card;
import com.example.medicine.model.MiniCard;
import com.example.medicine.model.Recipe;
import com.example.medicine.model.Vaccination;
import com.example.medicine.recipes.view.RecipeCardsView;
import com.example.medicine.repository.CardDataRepository;

import java.util.ArrayList;
import java.util.List;

public class RecipePresenter {

    private RecipeCardsView recipeCardsView;
    private List<Card> cards;
    private CardDataRepository cardDataRepository = new CardDataRepository();

    public RecipePresenter(RecipeCardsView recipeCardsView) {
        this.recipeCardsView = recipeCardsView;
        cards = cardDataRepository.getDataCards(true);
    }

    public void initList() {
        recipeCardsView.showMiniCardsList(getRecipeForAdapter());
    }

    public void startBigInformationActivity(int idCard, int idThis) {
    }

    private List<MiniCard> getRecipeForAdapter() {
        List<MiniCard> miniCards = new ArrayList<>();
        for (Card card : cards) {
            for (Recipe recipe : card.getSickLeave().getRecipes()) {
                String service = recipe.getDrugName();
                String fullDate = recipe.getStartDate() + " - " + recipe.getEndDate();
                MiniCard miniCard = new MiniCard(service, fullDate, card.getId(), recipe.getId());
                miniCards.add(miniCard);
            }
        }
        return miniCards;
    }
}
