package com.example.medicine.repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

class DataBaseHelper extends SQLiteOpenHelper {

    public DataBaseHelper(Context context) {
        // конструктор суперкласса
        super(context, "myDataBase", null, 1);
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