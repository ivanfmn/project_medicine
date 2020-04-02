package com.example.medicine.big_information_in_general_card.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.medicine.model.Card;
import com.example.medicine.R;
import com.example.medicine.big_information_in_general_card.presenter.DetailedInformationPresenter;
import com.example.medicine.big_information_in_general_card.view.DetailedInformationContract;

public class DetailedInformationActivity extends AppCompatActivity implements DetailedInformationContract.View {

    private DetailedInformationContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_informations);
        Intent intent = getIntent();
        Card card = (Card) intent.getSerializableExtra("card");
        presenter = new DetailedInformationPresenter(this);
        presenter.onEnterInformation(card);
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

        service.setText(card.getServiceName());
        nameDoctor.setText(card.getDoctorSurName() + " " + card.getDoctorName().substring(0, 1) + ". " + card.getDoctorPatronymicName().substring(0, 1) + ".");
        date.setText(card.getDate());
        place.setText(card.getPlace());
        sickLeave.setText(card.getSickLeave().toString());
        vaccination.setText(card.getVaccination().toString());
        repeatReception.setText(card.getReceptionRepeated() + " " + card.getReceptionRepeatedDate());
    }
}
