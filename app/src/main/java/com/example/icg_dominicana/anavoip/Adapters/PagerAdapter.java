package com.example.icg_dominicana.anavoip.Adapters;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.icg_dominicana.anavoip.Fragments.Entities;
import com.example.icg_dominicana.anavoip.Fragments.Gestion;
import com.example.icg_dominicana.anavoip.Fragments.Reports;

public class PagerAdapter extends FragmentStatePagerAdapter{

    private int numberOfTabs;

    public PagerAdapter(android.support.v4.app.FragmentManager fm, int numberOfTabs) {
        super( fm );
        this.numberOfTabs =  numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new Gestion();
            case 1:
                return new Reports();
            case 2:
                return new Entities() ;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }

}
