package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.medicine.Adapter.CardAdapter;
import com.example.medicine.Model.Card;
import com.example.medicine.Presenter.InformationPresenter;
import com.example.medicine.R;
import com.example.medicine.Interface.CardListInt;

import java.util.ArrayList;

public class CardList extends AppCompatActivity implements CardListInt {

    private InformationPresenter InfPres = new InformationPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);
        InfPres.EnterRV(this);
    }

    public void initList(ArrayList<Card> cards)
    {
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(rv.getContext());
        rv.setLayoutManager(llm);
        CardAdapter ad = new CardAdapter(cards, this);
        rv.setAdapter(ad);
    }
    public void startBigInformation(int position)
    {
        Intent intent = new Intent(CardList.this, BigInformations.class);
        intent.putExtra("idCard", position);
        startActivity(intent);
    }
}
