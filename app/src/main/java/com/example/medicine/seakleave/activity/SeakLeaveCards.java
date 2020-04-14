package com.example.medicine.seakleave.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicine.R;
import com.example.medicine.model.MiniCard;
import com.example.medicine.seakleave.adapter.ListAdapter;
import com.example.medicine.seakleave.presenter.SeakLeavesPresenter;
import com.example.medicine.seakleave.view.SeakLeaveCardsView;

import java.util.List;

public class SeakLeaveCards extends AppCompatActivity implements SeakLeaveCardsView {

    private SeakLeavesPresenter seakLeavesPresenter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvs_card);
        seakLeavesPresenter = new SeakLeavesPresenter(this);
        seakLeavesPresenter.initList();

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
        seakLeavesPresenter.startBigInformationActivity(idCard, idThis);
    }
}
