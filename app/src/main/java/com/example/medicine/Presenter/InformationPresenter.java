package com.example.medicine.Presenter;

import android.util.Log;

import com.example.medicine.Model.Card;
import com.example.medicine.Model.DataImportCard;
import com.example.medicine.Model.Recipe;
import com.example.medicine.Model.SickLeave;
import com.example.medicine.View.BigInformationInt;
import com.example.medicine.View.ViewInt;

import java.util.ArrayList;

public class InformationPresenter{

    DataImportCard DBImport = new DataImportCard();
    private ViewInt view;
    private BigInformationInt view2;

    public InformationPresenter() {
    }


    public void attachView(ViewInt view) {
        this.view = view;
    }

    public void attachView2(BigInformationInt view2)
    {
        this.view2 = view2;
    }

    public void StartNotice(ViewInt view)
    {
        view.startShortACtivity();
    }

    public void EnterInformation(BigInformationInt view2)
    {
        ArrayList<Card> All_Card = DBImport.DB_Card();

        view2.SetText(All_Card.get(0));
    }
}
