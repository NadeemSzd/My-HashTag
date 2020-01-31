package com.hfad.bitsandpizzas;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.ViewHolder>
{
    private String[] captions;
    private int[] imageIds;

    public RecyclerView_Adapter(String[] captions,int[] imageIds)
    {
        this.captions = captions;
        this.imageIds = imageIds;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_conatiner,parent,false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        CardView cardView = holder.cardView;
        ImageView imageView = cardView.findViewById(R.id.imageView);

        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(),imageIds[position]);

        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        TextView textView = cardView.findViewById(R.id.textView);

        textView.setText(captions[position]);

    }

    @Override
    public int getItemCount()
    {
        return captions.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private CardView cardView;
        public ViewHolder(@NonNull CardView itemView)
        {
            super(itemView);
            cardView = itemView;
        }
    }
}
