package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

import com.example.medicine.Adapter.CardAdapter;
import com.example.medicine.Model.Card;
import com.example.medicine.Presenter.MainPagePresenter;
import com.example.medicine.R;

import java.util.List;

public class MainPageView extends AppCompatActivity implements com.example.medicine.Interface.MainPageView {

    private MainPagePresenter mainPagePresenter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        mainPagePresenter = new MainPagePresenter(this);
        mainPagePresenter.onRecycleView();
        final ScrollView scrollView = findViewById(R.id.main_page_vertical_scroll_view);
        scrollView.getViewTreeObserver().addOnPreDrawListener(
                new ViewTreeObserver.OnPreDrawListener() {
                    @Override public boolean onPreDraw() {
                        scrollView.getViewTreeObserver().removeOnPreDrawListener(this);
                        scrollView.setScrollY(1450); return false; } });
    }

    public void initialisationCardsList(List<Card> cards) {
        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        final CardAdapter cardAdapter = new CardAdapter();
        cardAdapter.setCardAdapter(cards, MainPageView.this);
        recyclerView.setAdapter(cardAdapter);
        recyclerView.setClickable(false);
        recyclerView.setNestedScrollingEnabled(false);

    }

    public void onMoreInformationPresenter(Card card)
    {
        mainPagePresenter.onBigInformationPage(card);
    }

    public void startMoreInformationPage(Card card)
    {
        Intent intent = new Intent(MainPageView.this, MoreInformationView.class);
        intent.putExtra("card", card);
        startActivity(intent);
    }
}
