package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.medicine.Interface.BigInformationInt;
import com.example.medicine.Model.Card;
import com.example.medicine.Presenter.InformationPresenter;
import com.example.medicine.R;

public class BigInformations extends AppCompatActivity implements BigInformationInt {

    private InformationPresenter InfPres = new InformationPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_informations);
        InfPres.attachedView(this);
        Bundle arguments = getIntent().getExtras();
        InfPres.enterInformation( arguments.getInt("idCard"));
    }


    public void setText(Card s_Card)
    {
        TextView tv_service = (TextView) findViewById(R.id.TextService);
        TextView tv_namedoctor = (TextView) findViewById(R.id.NameDoctor);
        TextView tv_date = (TextView) findViewById(R.id.EditServiceDate);
        TextView tv_SickLeave = (TextView) findViewById(R.id.EditSeakLeave);
        TextView tv_Vaccination = (TextView) findViewById(R.id.EditVaccinations);
        TextView tv_RepReception = (TextView) findViewById(R.id.EditRepReception);


        tv_service.setText(s_Card.getNameService());
        tv_namedoctor.setText(s_Card.getSurNameDoctor() + " " + s_Card.getNameDoctor().substring(0,1) + ". " + s_Card.getPatronymicDoctor().substring(0,1)+ ".");
        tv_date.setText(s_Card.getDate());
        tv_SickLeave.setText(s_Card.getOnSickLeave());
        tv_Vaccination.setText(s_Card.getOnVaccination());
        tv_RepReception.setText(s_Card.getRepeatedReception() + " " + s_Card.getDateRepeatedReception());
    }
}
