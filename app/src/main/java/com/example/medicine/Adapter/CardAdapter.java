package com.example.medicine.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicine.Model.Card;
import com.example.medicine.Presenter.InformationPresenter;
import com.example.medicine.R;
import com.example.medicine.View.CardListInt;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder>
{

    private InformationPresenter InfPres = new InformationPresenter();

    private ArrayList<Card> Cards;
    private CardListInt view;

    public CardAdapter(ArrayList<Card> cards, CardListInt view){
        this.Cards = cards;
        this.view = view;
    }

    @NonNull
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        CardAdapter.ViewHolder pvh = new CardAdapter.ViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, final int position) {
        holder.nameDoctor.setText(this.Cards.get(position).GetNameDoctor());
        holder.nameService.setText(this.Cards.get(position).GetNameService());
        holder.EnterBigInformation.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                InfPres.StartBI(view, position);
                Log.d("XXX",""+position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.Cards.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cv;
        private TextView nameService;
        private TextView nameDoctor;
        private Button EnterBigInformation;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cv = (CardView)itemView.findViewById(R.id.card_view);
            this.nameService = (TextView)itemView.findViewById(R.id.Service);
            this.nameDoctor = (TextView)itemView.findViewById(R.id.Name);
            this.EnterBigInformation = (Button)itemView.findViewById(R.id.Button);
        }
    }
}
