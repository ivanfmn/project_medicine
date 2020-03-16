package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.medicine.Model.Card;
import com.example.medicine.Presenter.MoreInformationPresenter;
import com.example.medicine.R;

public class MoreInformationView extends AppCompatActivity implements com.example.medicine.Interface.MoreInformationView {

    private MoreInformationPresenter moreInformationPresenter = new MoreInformationPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_informations);
        Bundle arguments = getIntent().getExtras();
        assert arguments != null;
        moreInformationPresenter.onEnterInformation( arguments.getInt("idCard"));
    }


    @SuppressLint("SetTextI18n")
    public void setText(Card s_Card)
    {
        TextView service = findViewById(R.id.TextService);
        TextView nameDoctor = findViewById(R.id.NameDoctor);
        TextView date = findViewById(R.id.EditServiceDate);
        TextView sickLeave = findViewById(R.id.EditSeakLeave);
        TextView vaccination = findViewById(R.id.EditVaccinations);
        TextView repeatReception = findViewById(R.id.EditRepReception);


        service.setText(s_Card.getNameService());
        nameDoctor.setText(s_Card.getSurNameDoctor() + " " + s_Card.getNameDoctor().substring(0,1) + ". " + s_Card.getPatronymicDoctor().substring(0,1)+ ".");
        date.setText(s_Card.getDate());
        sickLeave.setText(s_Card.getOnSickLeave());
        vaccination.setText(s_Card.getOnVaccination());
        repeatReception.setText(s_Card.getRepeatedReception() + " " + s_Card.getDateRepeatedReception());
    }
}
