package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
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
        Intent intent = getIntent();
        Card card = (Card) intent.getSerializableExtra("card");
        moreInformationPresenter.onEnterInformation(card);
    }


    @SuppressLint("SetTextI18n")
    public void fillTextWithDataCard(Card card) {
        TextView service = findViewById(R.id.service_text);
        TextView nameDoctor = findViewById(R.id.doctor_name);
        TextView date = findViewById(R.id.service_date_edit);
        TextView place = findViewById(R.id.place_edit);
        TextView sickLeave = findViewById(R.id.seakleave_edit);
        TextView vaccination = findViewById(R.id.vaccination_edit);
        TextView repeatReception = findViewById(R.id.repeat_reception_edit);


        service.setText(card.getNameService());
        nameDoctor.setText(card.getSurNameDoctor() + " " + card.getNameDoctor().substring(0, 1) + ". " + card.getPatronymicDoctor().substring(0, 1) + ".");
        date.setText(card.getDate());
        place.setText(card.getPlace());
        sickLeave.setText(card.getOnSickLeave().toString());
        vaccination.setText(card.getOnVaccination().toString());
        repeatReception.setText(card.getRepeatedReception() + " " + card.getDateRepeatedReception());
    }
}
