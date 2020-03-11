package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.medicine.Model.Card;
import com.example.medicine.Presenter.InformationPresenter;
import com.example.medicine.R;

import java.util.ArrayList;

public class BigInformations extends AppCompatActivity implements BigInformationInt {

    private BigInformationInt Contract;
    private InformationPresenter InfPres = new InformationPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_informations);
        InfPres.attachView2(Contract);
        Bundle arguments = getIntent().getExtras();
        InfPres.EnterInformation(this, arguments.getInt("idCard"));
    }


    public void SetText(Card s_Card)
    {
        TextView tv_service = (TextView) findViewById(R.id.TextService);
        TextView tv_namedoctor = (TextView) findViewById(R.id.NameDoctor);
        TextView tv_date = (TextView) findViewById(R.id.EditServiceDate);
        TextView tv_SickLeave = (TextView) findViewById(R.id.EditSeakLeave);
        TextView tv_Vaccination = (TextView) findViewById(R.id.EditVaccinations);
        TextView tv_RepReception = (TextView) findViewById(R.id.EditRepReception);


        tv_service.setText(s_Card.GetNameService());
        tv_namedoctor.setText(s_Card.GetSurNameDoctor() + " " + s_Card.GetNameDoctor().substring(0,1) + ". " + s_Card.GetPatronymicDoctor().substring(0,1)+ ".");
        tv_date.setText(s_Card.GetDate());
        tv_SickLeave.setText(s_Card.GetOnSickLeave());
        tv_Vaccination.setText(s_Card.GetOnVaccination());
        tv_RepReception.setText(s_Card.GetRepeatedReception() + " " + s_Card.GetDateRepeatedReception());
    }
}
