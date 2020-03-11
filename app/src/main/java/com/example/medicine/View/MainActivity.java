package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.medicine.Adapter.CardAdapter;
import com.example.medicine.CardList;
import com.example.medicine.Model.Card;
import com.example.medicine.Model.Vaccination;
import com.example.medicine.Model.Recipe;
import com.example.medicine.Model.SickLeave;
import com.example.medicine.Presenter.InformationPresenter;
import com.example.medicine.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewInt {

    private InformationPresenter InfPres = new InformationPresenter();
    private ViewInt Contract;
    private Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InfPres.attachView(Contract);
        myButton = (Button) findViewById(R.id.button);
        myButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button:
                InfPres.StartNotice(this);
        }
    }

    public void startShortACtivity()
    {
        Intent intent = new Intent(MainActivity.this, BigInformations.class);
        startActivity(intent);
    }
    public void ShowNotice( String notice)
    {
        Log.d("ShowNotice", "Show");
        Toast toast = Toast.makeText(this, notice, Toast.LENGTH_LONG);
        toast.show();
    }
    public void StartListActivity()
    {
        Intent intent = new Intent(MainActivity.this, CardList.class);
        startActivity(intent);
    }

}