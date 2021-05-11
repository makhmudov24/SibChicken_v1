package com.example.sibchicken;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sibchicken.tables.Menu1Week;

import java.util.List;

public class RecMenuAdapter extends RecyclerView.Adapter<RecMenuAdapter.ViewHolder> {

    private final List<Menu1Week> mValues;

    public RecMenuAdapter(List<Menu1Week> list) {
        this.mValues = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
