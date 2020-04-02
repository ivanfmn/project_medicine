package com.example.medicine.repository;

import com.example.medicine.model.Card;
import com.example.medicine.model.Recipe;
import com.example.medicine.model.SickLeave;
import com.example.medicine.model.Vaccination;

import java.util.ArrayList;
import java.util.List;

public class FakeCardData {

    public List<Card> getFakeDataCards() {
        return createCardsList();
    }

    private List<Card> createCardsList() {
        List<Card> cards = new ArrayList<Card>();
        for (int i = 0; i < 10; i++) {
            cards.add(createCard(i));
        }
        return cards;
    }

    private Card createCard(int id) {
        Card card = new Card(id,
                "Visit " + id,
                "Irina",
                "Fomenko",
                "Vasilevna",
                "15.12.2019",
                "Earth, Russia, Rostov region, Taganrog, Aleksandrovskaya 30, kv 424 xxxxxxxxxxxxxxxxxxxxxxxxx",
                true,
                "01.01.2021",
                true,
                createSickLeave(id),
                true,
                fillVaccinationsList().size(),
                fillVaccinationsList());
        return card;
    }

    private SickLeave createSickLeave(int id) {
        SickLeave sickLeave = new SickLeave(id,
                "Bronhit " + id,
                "12/12/2015",
                "25/12/2015",
                createRecipesList().size(),
                false,
                createRecipesList());
        return sickLeave;
    }

    private List<Recipe> createRecipesList() {
        List<Recipe> recipes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            recipes.add(createRecipe(i));
        }
        return recipes;
    }

    private Recipe createRecipe(int id) {
        Recipe recipe = new Recipe(id,
                "Paracetamol " + id,
                "01.01.2005",
                "05.01.2005",
                2,
                150f,
                false,
                true,
                false,
                true,
                2
        );
        return recipe;
    }

    private List<Vaccination> fillVaccinationsList() {
        List<Vaccination> vaccinations = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            vaccinations.add(createVaccination(i));
        }
        return vaccinations;
    }

    private Vaccination createVaccination(int id) {
        Vaccination vaccination = new Vaccination(id,
                "Check " + id,
                "25.01.2009");
        return vaccination;
    }
}
