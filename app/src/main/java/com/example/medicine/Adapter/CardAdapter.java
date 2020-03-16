package com.example.medicine.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicine.Interface.MainPageView;
import com.example.medicine.Model.Card;
import com.example.medicine.Presenter.MainPagePresenter;
import com.example.medicine.R;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private MainPageView mainPageView;
    private List<Card> cards;

    public void setCardAdapter(List<Card> cards, MainPageView mainPageView){
        this.cards = cards;
        this.mainPageView = mainPageView;
    }
    public void setCardsListInAdapter(List<Card> cards){
        this.cards = cards;
    }

    @NonNull
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, final int position) {
        final Card card = cards.get(position);
        holder.nameDoctor.setText(card.getNameDoctor());
        holder.nameService.setText(card.getNameService());
        holder.EnterBigInformation.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        mainPageView.onMoreInformationPresenter(card);
                    }
                });
    }


    @Override
    public int getItemCount() {
        return this.cards.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nameService;
        private TextView nameDoctor;
        private Button EnterBigInformation;


        ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.nameService = (TextView)itemView.findViewById(R.id.Service);
            this.nameDoctor = (TextView)itemView.findViewById(R.id.Name);
            this.EnterBigInformation = (Button)itemView.findViewById(R.id.Button);
        }
    }
}
