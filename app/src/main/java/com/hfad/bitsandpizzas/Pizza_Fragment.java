package com.hfad.bitsandpizzas;


import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Pizza_Fragment extends Fragment
{

    static List<Trend> trends;
    //SearchView searchView;
    static
    {
        trends = new ArrayList<>();
        //searchView = MainActivity.searchView;
    }

    static trend_RecyclerView adapter;

    public Pizza_Fragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.pizza_fragment,container,false);

       // searchView.setOnQueryTextListener(this);

        String[] titles = new String[Pizza.pizzas.length];
       // String[] messages = new String[Pizza.pizzas.length];

        String title,message;

        for (int i = 0; i < titles.length; i++)
        {
            title = Pizza.pizzas[i].getTitle();
            message = Pizza.pizzas[i].getMessage();
            Trend trend = new Trend(title,message);

            trends.add(trend);
        }

        adapter = new trend_RecyclerView(trends);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        return recyclerView;
       // return inflater.inflate(R.layout.pizza_fragment, container, false);
    }


}
