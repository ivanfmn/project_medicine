package com.example.medicine.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DataImportCards {


    public List<Card> getBaseCardTest() {
        List<Card> cards = new ArrayList<Card>();
        for (int i = 0; i < 50; i++) {
            cards.add(fillCard());
        }
        return cards;
    }

    private Card fillCard() {
        Card card = new Card();

        card.setFullName("Irina", "Fomenko", "Vasilevna");
        card.setDateCard("15.12.2019");
        card.setNameService("Visit ");
        card.setPlace("Earth, Russia, Rostov region, Taganrog, Aleksandrovskaya 30, kv 424 xxxxxxxxxxxxxxxxxxxxxxxxx");
        card.setRepeatedReception(true, "01.01.2021");

        card.setOnSickLeave(true);
        if (card.getOnSickLeave()) {
            card.setOnSickLeave(true, fillSickLeave());
        }

        card.setOnVaccination(true);
        if (card.getOnVaccination()) {
            card.setOnVaccination(true, fillVaccinationsList());
        }

        return card;
    }

    private SickLeave fillSickLeave() {
        SickLeave sickLeave = new SickLeave();

        sickLeave.setGoToWork(false);
        sickLeave.setDiagnosis("Bronhit");
        sickLeave.setStartEndSickLeave("12/12/2015", "25/12/2015");
        sickLeave.setRecipes(fillRecipesList());

        return sickLeave;
    }

    private List<Recipe> fillRecipesList() {
        List<Recipe> recipes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            recipes.add(fillRecipe());
        }

        return recipes;
    }

    private Recipe fillRecipe() {
        Recipe recipe = new Recipe();
        recipe.setNameDrug("Paracetamol");
        recipe.setDosage(150f);
        recipe.setFrequency(2);
        recipe.setStartEndDate("01.01.2005", "05.01.2005");
        recipe.setReminder(false);
        recipe.setCompabilityAll(true, false, true, 2);
        return recipe;
    }

    private List<Vaccination> fillVaccinationsList() {
        List<Vaccination> vaccinations = new ArrayList<>();
        //
        for (int i = 0; i < 5; i++) {
            vaccinations.add(fillVaccination());
        }
        return vaccinations;
    }

    private Vaccination fillVaccination() {
        Vaccination vaccination = new Vaccination();
        vaccination.setDateEnter("25.01.2009");
        vaccination.setNameVaccination("Check");
        return vaccination;
    }

    class DBHelper extends SQLiteOpenHelper {

        public DBHelper(Context context) {
            // конструктор суперкласса
            super(context, "myDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.d("DBHelper", "--- onCreate database ---");
            // создаем таблицу с полями
            db.execSQL("create table mytable ("
                    + "id integer primary key autoincrement,"
                    + "name text,"
                    + "surname text,"
                    + "threename text,"
                    + "date text,"
                    + "place text,"
                    + "seackleave text,"
                    + "vaccination text,"
                    + "service text" + ");");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }
    }
}
