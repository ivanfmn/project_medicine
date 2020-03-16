package com.example.medicine.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicine.Model.Card;
import com.example.medicine.Presenter.MainPagePresenter;
import com.example.medicine.R;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private MainPagePresenter mainPagePresenter;
    private List<Card> cards;

    public void setCardAdapter(List<Card> cards, MainPagePresenter cardsListPresenter){
        this.cards = cards;
        this.mainPagePresenter = cardsListPresenter;
    }
    public void setCardsListInAdapter(List<Card> cards){
        this.cards = cards;
    }

    @NonNull
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, final int position) {
        holder.nameDoctor.setText(cards.get(position).getNameDoctor());
        holder.nameService.setText(cards.get(position).getNameService());
        holder.EnterBigInformation.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        mainPagePresenter.onBigInformationPage(position);
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
