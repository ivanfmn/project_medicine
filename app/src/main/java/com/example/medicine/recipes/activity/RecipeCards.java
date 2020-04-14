package com.example.medicine.recipes.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.medicine.R;
import com.example.medicine.model.MiniCard;
import com.example.medicine.recipes.view.RecipeCardsView;
import com.example.medicine.recipes.presenter.RecipePresenter;
import com.example.medicine.recipes.adapter.ListAdapter;

import java.util.List;

public class RecipeCards extends AppCompatActivity implements RecipeCardsView {

    private RecipePresenter recipePresenter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvs_card);
        recipePresenter = new RecipePresenter(this);
        recipePresenter.initList();

    }

    public void showMiniCardsList(List<MiniCard> miniCards) {
        recyclerView = findViewById(R.id.rv2);
        recyclerView.setHasFixedSize(true);
        ListAdapter listAdapter = new ListAdapter();
        listAdapter.setRVSAdapter(miniCards, this);
        recyclerView.setAdapter(listAdapter);
        recyclerView.setClickable(false);
        recyclerView.setNestedScrollingEnabled(true);
    }

    public void setActivity(int idCard, int idThis) {
        recipePresenter.startBigInformationActivity(idCard, idThis);
    }
}
