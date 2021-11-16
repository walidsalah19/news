package com.example.news;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.news.fragments.home.Home;
import com.example.news.fragments.entertanment.entertenment;
import com.example.news.fragments.healthy.healthy;
import com.example.news.fragments.science.science;
import com.example.news.fragments.sports.sports;
import com.example.news.fragments.technology.technology;

public class create_tabs extends FragmentPagerAdapter {
    public create_tabs(@NonNull FragmentManager fm) {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Home();
            case 1:
                return new healthy();
            case 2:
                return new sports();
            case 3:
                return new technology();
            case 4:
                return new science();
            case 5:
                return new entertenment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position)
        {
            case 0:
                return "Home";
            case 1:
                return "Healthy";
            case 2:
                return "Sports";
            case 3:
                return "Technology";
            case 4:
                return "Science";
            case 5:
                return "Entertenment";

        }
        return super.getPageTitle(position);
    }
}
