package com.example.medicine.Presenter;

import android.widget.ListView;

import com.example.medicine.Model.Card;
import com.example.medicine.Model.DataImportCard;
import com.example.medicine.Interface.BigInformationInt;
import com.example.medicine.Interface.CardListInt;
import com.example.medicine.Interface.ViewInt;
import com.example.medicine.View.CardList;

import java.util.ArrayList;

public class InformationPresenter{

    private DataImportCard DBImport = new DataImportCard();
    private ViewInt view;
    private BigInformationInt view2;
    private CardListInt view3;


    public void attachedView(ViewInt view) {
        this.view = view;
    }

    public void attachedView(BigInformationInt view) {
        this.view2 = view;
    }

    public void attachedView(CardListInt view) {
        this.view3 = view;
    }

    public void startListActivity()
    {
        this.view.startListActivity();
    }

    public void startBigInformatio(int ID)
    {
        this.view3.startBigInformation(ID);
    }

    public void enterInformation(int ID)
    {
        ArrayList<Card> All_Cards = DBImport.DB_Card();
        this.view2.setText(All_Cards.get(ID));
    }

    public void enterRV()
    {
        ArrayList<Card> All_Cards = DBImport.DB_Card();
        this.view3.initList(All_Cards);
    }
}
