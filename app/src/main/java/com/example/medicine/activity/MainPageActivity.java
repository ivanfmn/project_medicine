package com.example.medicine.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

import com.example.medicine.adapter.CardAdapter;
import com.example.medicine.model.Card;
import com.example.medicine.presenter.MainPagePresenter;
import com.example.medicine.R;
import com.example.medicine.view.MainPageContract;

import java.util.List;

public class MainPageActivity extends AppCompatActivity implements MainPageContract.View, CardAdapter.CardClickListener, android.view.View.OnClickListener {

    private MainPageContract.Presenter presenter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        presenter = new MainPagePresenter(this);
        presenter.onRecycleView();
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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_open_recipes:
                presenter.onRVSActivity(1);
                break;
            case R.id.button_open_vaccinations:
                presenter.onRVSActivity(2);
                break;
            case R.id.button_open_sickleaves:
                presenter.onRVSActivity(3);
                break;
        }
    }

    public void showCardsList(List<Card> cards) {
        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CardAdapter cardAdapter = new CardAdapter();
        cardAdapter.setCardAdapter(cards, this);
        recyclerView.setAdapter(cardAdapter);
        recyclerView.setClickable(false);
        recyclerView.setNestedScrollingEnabled(false);
    }

    public void onCardClick(Card card) {
        presenter.onBigInformationPage(card);
    }

    public void startMoreInformationPage(Card card) {
        Intent intent = new Intent(MainPageActivity.this, DetailedInformationActivity.class);
        intent.putExtra("card", card);
        startActivity(intent);
    }

    public void startRVSPage(int idRequest) {
        Intent intent = new Intent(MainPageActivity.this, RVSCard.class);
        intent.putExtra("idRequest", idRequest);
        startActivity(intent);
    }
}
