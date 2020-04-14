package com.example.medicine.vaccinations.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicine.R;
import com.example.medicine.model.MiniCard;
import com.example.medicine.vaccinations.adapter.ListAdapter;
import com.example.medicine.vaccinations.presenter.VaccinationsPresenter;
import com.example.medicine.vaccinations.view.VaccinationCardsView;

import java.util.List;

public class VacccinationsCards extends AppCompatActivity implements VaccinationCardsView {

    private VaccinationsPresenter vaccinationsPresenter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvs_card);
        vaccinationsPresenter = new VaccinationsPresenter(this);
        vaccinationsPresenter.initList();

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
        vaccinationsPresenter.startBigInformationActivity(idCard, idThis);
    }
}
