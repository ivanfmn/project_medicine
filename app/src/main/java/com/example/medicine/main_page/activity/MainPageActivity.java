package com.example.medicine.main_page.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medicine.big_information_in_general_card.activity.DetailedInformationActivity;
import com.example.medicine.main_page.view.MainPageContract;
import com.example.medicine.main_page.presenter.MainPagePresenter;
import com.example.medicine.main_page.adapter.CardAdapter;
import com.example.medicine.model.Card;
import com.example.medicine.R;
import com.example.medicine.recipes.activity.RecipeCards;
import com.example.medicine.seakleave.activity.SeakLeaveCards;
import com.example.medicine.vaccinations.activity.VacccinationsCards;

import java.util.List;

public class MainPageActivity extends AppCompatActivity implements MainPageContract.View, CardAdapter.CardClickListener, View.OnClickListener {

    private MainPageContract.Presenter presenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        presenter = new MainPagePresenter(this);
        presenter.onRecycleView();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_open_recipes:
                presenter.onRecipeActivity();
                break;
            case R.id.button_open_vaccinations:
                presenter.onVaccinationActivity();
                break;
            case R.id.button_open_sickleaves:
                presenter.onSeakLeaveActivity();
                break;
        }
    }

    public void showCardsList(List<Card> cards) {
        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        CardAdapter cardAdapter = new CardAdapter(cards, this);
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

    public void startRecipeActivity() {
        Intent intent = new Intent(MainPageActivity.this, RecipeCards.class);
        startActivity(intent);
    }

    public void startVaccinationActivity() {
        Intent intent = new Intent(MainPageActivity.this, VacccinationsCards.class);
        startActivity(intent);
    }

    public void startSeakLeaveActivity() {
        Intent intent = new Intent(MainPageActivity.this, SeakLeaveCards.class);
        startActivity(intent);
    }
}
