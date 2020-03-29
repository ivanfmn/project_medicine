package com.example.medicine.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicine.model.Card;
import com.example.medicine.R;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    public interface CardClickListener{
        void onCardClick(Card card);
    }

    private CardClickListener view;
    private List<Card> cards;

    public void setCardAdapter(List<Card> cards, CardClickListener view) {
        this.cards = cards;
        this.view = view;
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
        holder.doctorName.setText(card.getDoctorName());
        holder.serviceName.setText(card.getServiceName());
        holder.enterBigInformation.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        view.onCardClick(card);
                    }
                });
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView serviceName;
        private TextView doctorName;
        private Button enterBigInformation;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.serviceName = (TextView) itemView.findViewById(R.id.service);
            this.doctorName = (TextView) itemView.findViewById(R.id.same);
            this.enterBigInformation = (Button) itemView.findViewById(R.id.button);
        }
    }
}
