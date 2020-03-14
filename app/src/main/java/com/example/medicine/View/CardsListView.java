package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.medicine.Adapter.CardAdapter;
import com.example.medicine.Presenter.CardsListPresenter;
import com.example.medicine.R;

public class CardsListView extends AppCompatActivity implements com.example.medicine.Interface.CardsListView {

    private CardsListPresenter cardsListPresenter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);
        cardsListPresenter = new CardsListPresenter(this);
        cardsListPresenter.onRecycleView();
    }



    public void initialisationCardsList(CardAdapter cardAdapter) {
        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(cardAdapter);

    }

    public void startBigInformation(int position) {
        Intent intent = new Intent(CardsListView.this, MoreInformationView.class);
        intent.putExtra("idCard", position);
        startActivity(intent);
    }

}
