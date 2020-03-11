package com.example.medicine.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DataImportCard {



    public ArrayList<Card> DB_Card()
    {

        ArrayList<Card> s_Cards = new ArrayList<Card>();
        for(int i = 0; i < 50; i++)
        {
            Card s_Card = new Card();
            SickLeave s_SickLeave = new SickLeave();
            ArrayList<Recipe> s_Recipes = new ArrayList<Recipe>();
            Recipe s_Recipe = new Recipe();
            s_Card.setFullName("Irina","Fomenko","Vasilevna");
            s_Card.setDateCard("15.12.2019");
            s_Card.setNameService("Visit " + i);
            s_Card.setOnSickLeave(false);
            s_Card.setOnVaccination(false);
            s_Card.setRepeatedReception(true, "01.01.2021");
            s_Recipe.setNameDrug("XX 1 XX");
            s_Recipes.add(s_Recipe);
            s_SickLeave.setRecipes(s_Recipes);
            s_Cards.add(s_Card);
        }

        return s_Cards;
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
