package com.example.medicine.Presenter;

import com.example.medicine.Model.Card;
import com.example.medicine.Model.DataImportCard;
import com.example.medicine.Interface.BigInformationInt;
import com.example.medicine.Interface.CardListInt;
import com.example.medicine.Interface.ViewInt;

import java.util.ArrayList;

public class InformationPresenter{

    DataImportCard DBImport = new DataImportCard();
    private ViewInt view;
    private BigInformationInt view2;
    private CardListInt view3;


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
        view.startListActivity();
    }

    public void StartBI(CardListInt view, int ID)
    {
        view.startBigInformation(ID);
    }

    public void EnterInformation(BigInformationInt view, int ID)
    {
        ArrayList<Card> All_Cards = DBImport.DB_Card();
        view.setText(All_Cards.get(ID));
    }
    public void EnterRV(CardListInt view)
    {
        ArrayList<Card> All_Cards = DBImport.DB_Card();
        view.initList(All_Cards);
    }
}
