package com.example.firstapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountriesAdapter  extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {
    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class CountriesViewHolder extends RecyclerView.ViewHolder{
        public CountriesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
