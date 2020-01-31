package com.hfad.bitsandpizzas;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import static com.hfad.bitsandpizzas.Pizza_Fragment.adapter;
import static com.hfad.bitsandpizzas.Pizza_Fragment.trends;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener
{

    DrawerLayout drawerLayout;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawerLayout = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_open_drawer,R.string.nav_close_drawer);
        drawerLayout.addDrawerListener(drawerToggle);  // add DrawerToggle into DrawerLayout
        drawerToggle.syncState(); // add drawer icon on toolbar

        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter);
       // TableLayout layout = findViewById(R.id.fragment_tabs);

        TabLayout tabLayout =  findViewById(R.id.fragment_tabs);
        tabLayout.setupWithViewPager(pager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        MenuItem menuItem = menu.findItem(R.id.search);
        searchView = (SearchView) menuItem.getActionView();

        searchView.setQueryHint("Type here to search");

        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {
        String userInput = newText;

        List<Trend> trendList = new ArrayList<>();

        for(Trend trend:trends)
        {
            if(trend.getTitle().toLowerCase().contains(userInput))
            {
                trendList.add(trend);
                System.out.println("**********************");
                System.out.println(trendList.size());
                System.out.println("**********************");
            }
        }
        adapter.updateList(trendList);
        return true;
    }


   /* @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.action_create_order:
                Intent intent = new Intent(this,OrderActivity.class);
                startActivity(intent);
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }

    }*/

    private class SectionsPagerAdapter extends FragmentPagerAdapter
    {

        SectionsPagerAdapter(FragmentManager m)
        {
            super(m);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch (position)
            {
                case 0:
                    return new Top_fragment();
                case 1:
                    return new Pizza_Fragment();
                case 2:
                    return new Trends();
            }

            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0:
                    return getResources().getText(R.string.top_fragment_title);
                    case 1:
                        return getResources().getText(R.string.pizza_fragment_title);
                        case 2:
                            return getResources().getText(R.string.pasta_fragment_title);
            }
            return null;
        }
    }

}



