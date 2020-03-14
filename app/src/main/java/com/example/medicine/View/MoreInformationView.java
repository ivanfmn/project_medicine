package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;

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
        moreInformationPresenter.onEnterInformation( arguments.getInt("idCard"));
    }


    public void setText(Card s_Card)
    {
        TextView tv_service = findViewById(R.id.TextService);
        TextView tv_namedoctor = findViewById(R.id.NameDoctor);
        TextView tv_date = findViewById(R.id.EditServiceDate);
        TextView tv_SickLeave = findViewById(R.id.EditSeakLeave);
        TextView tv_Vaccination = findViewById(R.id.EditVaccinations);
        TextView tv_RepReception = findViewById(R.id.EditRepReception);


        tv_service.setText(s_Card.getNameService());
        tv_namedoctor.setText(s_Card.getSurNameDoctor() + " " + s_Card.getNameDoctor().substring(0,1) + ". " + s_Card.getPatronymicDoctor().substring(0,1)+ ".");
        tv_date.setText(s_Card.getDate());
        tv_SickLeave.setText(s_Card.getOnSickLeave());
        tv_Vaccination.setText(s_Card.getOnVaccination());
        tv_RepReception.setText(s_Card.getRepeatedReception() + " " + s_Card.getDateRepeatedReception());
    }
}
