package com.example.alimseolap1.views.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.alimseolap1.views.Fragment.AllFragment;
import com.example.alimseolap1.views.Fragment.SettingsFragment;
import com.example.alimseolap1.views.Fragment.SortFragment;

import java.util.ArrayList;

public class ContentsPagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<Fragment> items = new ArrayList<Fragment>();
    private String[] tabTitles = new String[]{"모두보기", "추려보기", "설정", "앱 선택"};

    public ContentsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addItem(Fragment item){
        items.add(item);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}

