package com.example.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private Toolbar toolbar;
    private ViewPager viewPager;
     static int y=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(y==0)
        {
            startActivity(new Intent(MainActivity.this,splash.class));
            y++;
        }
        Toolbar_method();
        tabLayout_method();


    }
    private void tabLayout_method()
    {
        tabLayout=findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewpager);
        create_tabs tabs=new create_tabs(getSupportFragmentManager());
        viewPager.setAdapter(tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).select();
    }
    private void Toolbar_method()
    {
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}