package com.example.medicine.Presenter;

import com.example.medicine.Interface.MainView;

public class MainPresenter {
    private MainView mainView;

    public MainPresenter(MainView mainView){
        this.mainView = mainView;
    }

    public void onCardsListView(){
        mainView.startListActivity();
    }
}
