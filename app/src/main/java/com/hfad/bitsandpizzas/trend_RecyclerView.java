package com.hfad.bitsandpizzas;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class trend_RecyclerView extends RecyclerView.Adapter<trend_RecyclerView.ViewHolder>
{
    private String[] titles;
    private String[] messages;

    public List<Trend> trends;


    View parentView;

    public trend_RecyclerView(List<Trend> list)
    {
        this.trends = list;
       // this.titles = titles;
       // this.messages = messages;
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.new_cardview_container,parent,false);

        parentView = parent;

        return new trend_RecyclerView .ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull trend_RecyclerView.ViewHolder holder, int position)
    {
        CardView cardView = holder.cardView;

        TextView trend = cardView.findViewById(R.id.trend);
        // trend.setText(titles[position]);

        trend.setText(trends.get(position).getTitle());

        TextView message = cardView.findViewById(R.id.message);
        //message.setText(messages[position]);
        message.setText(trends.get(position).getMessage());

    }

    @Override
    public int getItemCount()
    {
        return trends.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private CardView cardView;
        ImageView copy,like;

        public ViewHolder(@NonNull CardView itemView)
        {
            super(itemView);
            cardView = itemView;

            copy = itemView.findViewById(R.id.copy);
            like = itemView.findViewById(R.id.heart);

            this.copy.setOnClickListener(this);
            this.like.setOnClickListener(this);
        }

        @Override
        public void onClick(View view)
        {
            switch (view.getId())
            {
                case R.id.copy:
                {
                    Toast.makeText(parentView.getContext(),"Copy Item is clicked!",Toast.LENGTH_SHORT).show();
                }
                break;
                case R.id.heart:
                {
                    Toast.makeText(parentView.getContext(),"Like Item is clicked!",Toast.LENGTH_SHORT).show();
                }
            }

        }
    }

    public void updateList(List<Trend> trends_newList)
    {
        trends = new ArrayList<>();
        trends.addAll(trends_newList);
        notifyDataSetChanged();
    }

}
