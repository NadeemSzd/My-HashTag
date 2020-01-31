package com.hfad.bitsandpizzas;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Top_fragment extends Fragment
{


    public Top_fragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_top_fragment,container,false);

        String[] names = new String[Popular.popular.length];
        for (int i = 0; i < names.length; i++)
        {
            names[i] = Popular.popular[i].getName();
        }
        int[] images = new int[Popular.popular.length];
        for (int i = 0; i < images.length; i++)
        {
            images[i] = Popular.popular[i].getImageResourceId();
        }

        RecyclerView_Adapter adapter = new RecyclerView_Adapter(names,images);
        recyclerView.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        return recyclerView;
    }

}
