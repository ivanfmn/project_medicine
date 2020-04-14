package com.example.medicine.recipes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicine.R;
import com.example.medicine.model.MiniCard;
import com.example.medicine.recipes.view.RecipeCardsView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private RecipeCardsView recipeCardsView;
    private List<MiniCard> miniCards;

    public void setRVSAdapter(List<MiniCard> miniCards, RecipeCardsView recipeCardsView) {
        this.miniCards = miniCards;
        this.recipeCardsView = recipeCardsView;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, final int position) {
        final MiniCard miniCard = miniCards.get(position);
        holder.service.setText(miniCard.getService());
        holder.date.setText(miniCard.getDate());
        holder.enterBigInformation.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        recipeCardsView.setActivity(miniCard.getIdCard(),miniCard.getIdThis());
                    }
                });
    }

    @Override
    public int getItemCount() {
        return miniCards.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView date;
        private TextView service;
        private Button enterBigInformation;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.service = (TextView) itemView.findViewById(R.id.service);
            this.date = (TextView) itemView.findViewById(R.id.same);
            this.enterBigInformation = (Button) itemView.findViewById(R.id.button);
        }
    }
}
