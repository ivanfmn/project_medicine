package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.medicine.Presenter.MainPresenter;
import com.example.medicine.R;

public class MainView extends AppCompatActivity implements View.OnClickListener, com.example.medicine.Interface.MainView {

    private MainPresenter mainPresenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button openCardsListView;
        openCardsListView = findViewById(R.id.open_cards_list_view);
        openCardsListView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.open_cards_list_view:
                mainPresenter.onCardsListView();
        }
    }

    public void showNotice( String notice) {
        Log.d("ShowNotice", "Show");
        Toast toast = Toast.makeText(this, notice, Toast.LENGTH_LONG);
        toast.show();
    }

    public void startShortActivity() {
        Intent intent = new Intent(MainView.this, MoreInformationView.class);
        startActivity(intent);
    }

    public void startListActivity() {
        Intent intent = new Intent(MainView.this, CardsListView.class);
        startActivity(intent);
    }

}