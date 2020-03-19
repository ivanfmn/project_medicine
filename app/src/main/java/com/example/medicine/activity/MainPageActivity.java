package com.example.medicine.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

import com.example.medicine.adapter.CardAdapter;
import com.example.medicine.model.Card;
import com.example.medicine.presenter.MainPagePresenter;
import com.example.medicine.R;

import java.util.List;

public class MainPageActivity extends AppCompatActivity implements com.example.medicine.view.MainPageActivity {

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
                    @Override
                    public boolean onPreDraw() {
                        scrollView.getViewTreeObserver().removeOnPreDrawListener(this);
                        scrollView.setScrollY(1450);
                        return false;
                    }
                });
    }

    public void showCardsList(List<Card> cards) {
        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        final CardAdapter cardAdapter = new CardAdapter();
        cardAdapter.setCardAdapter(cards, MainPageActivity.this);
        recyclerView.setAdapter(cardAdapter);
        recyclerView.setClickable(false);
        recyclerView.setNestedScrollingEnabled(false);

    }

    public void onMoreInformationPresenter(Card card) {
        mainPagePresenter.onBigInformationPage(card);
    }

    public void startMoreInformationPage(Card card) {
        Intent intent = new Intent(MainPageActivity.this, DetailedInformationActivity.class);
        intent.putExtra("card", card);
        startActivity(intent);
    }
}
