package com.hfad.bitsandpizzas;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Trends extends Fragment
{

    List<Trend> trendsList;
    {
        trendsList = new ArrayList<>();
    }

    public Trends()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.pizza_fragment,container,false);

        /*String[] titles = new String[Trend.Trends.length];
        for (int i = 0; i < titles.length; i++)
        {
            titles[i] = Trend.Trends[i].getTitle();
        }
        String[] messages = new String[Trend.Trends.length];
        for (int i = 0; i < messages.length; i++)
        {
            messages[i] = Trend.Trends[i].getMessage();
        }*/

        String[] titles = new String[Trend.Trends.length];
        //String[] messages = new String[Trend.Trends.length];

        String title,message;

        for (int i = 0; i < titles.length; i++)
        {
            title = Trend.Trends[i].getTitle();
            message = Trend.Trends[i].getMessage();

            Trend trend = new Trend(title,message);
            trendsList.add(trend);
        }


        trend_RecyclerView adapter = new trend_RecyclerView(trendsList);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        return recyclerView;

        //return inflater.inflate(R.layout.fragment_trends, container, false);
    }

}
