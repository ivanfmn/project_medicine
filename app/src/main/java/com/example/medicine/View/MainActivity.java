package com.example.medicine.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.medicine.Interface.ViewInt;
import com.example.medicine.Presenter.InformationPresenter;
import com.example.medicine.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewInt {

    private InformationPresenter InfPres = new InformationPresenter();
    private ViewInt view;
    private Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InfPres.attachView(view);
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

    public void startShortActivity()
    {
        Intent intent = new Intent(MainActivity.this, BigInformations.class);
        startActivity(intent);
    }
    public void showNotice( String notice)
    {
        Log.d("ShowNotice", "Show");
        Toast toast = Toast.makeText(this, notice, Toast.LENGTH_LONG);
        toast.show();
    }
    public void startListActivity()
    {
        Intent intent = new Intent(MainActivity.this, CardList.class);
        startActivity(intent);
    }

}