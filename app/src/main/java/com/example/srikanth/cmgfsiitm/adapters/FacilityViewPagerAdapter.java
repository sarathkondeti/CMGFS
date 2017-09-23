package com.example.srikanth.cmgfsiitm.adapters;

/**
 * Created by srikanth on 19/09/17.
 */
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.srikanth.cmgfsiitm.fragment.CustomerFormFragment;
import com.example.srikanth.cmgfsiitm.fragment.EateryFormFragment;
import com.example.srikanth.cmgfsiitm.fragment.NonEateryFormFragment;

public class FacilityViewPagerAdapter extends FragmentPagerAdapter {
    private String facilityType;

    public FacilityViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        if(facilityType.equalsIgnoreCase("Eatery")){
            if(position==0) {
                CustomerFormFragment fragment = new CustomerFormFragment();
                fragment.setFacilityType("Eatery");
                return fragment;
            }else {
                EateryFormFragment fragment = new EateryFormFragment();
                return fragment;
            }
        }else{
            if(position==0) {
                CustomerFormFragment fragment = new CustomerFormFragment();
                fragment.setFacilityType("NonEatery");
                return fragment;
            }else {
                NonEateryFormFragment fragment = new NonEateryFormFragment();
                return fragment;
            }
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    public void setFacilityType(String facilityType){
        this.facilityType=facilityType;
    }

}
