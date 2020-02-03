package com.mahmoud.dahdouh.demoproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Model> list = new ArrayList<>();

    public void setList(List<Model> ModelList) {
        this.list = ModelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(position);
        System.out.println("position : " + position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        // Declere your views
        private TextView textView;
        private ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // inflate the view
            textView = itemView.findViewById(R.id.text);
            image = itemView.findViewById(R.id.image);
        }

        private void bind(int position) {
            // Bind data
            textView.setText(list.get(position).getText());
            image.setImageResource(R.color.colorAccent);

        }
    }
}
