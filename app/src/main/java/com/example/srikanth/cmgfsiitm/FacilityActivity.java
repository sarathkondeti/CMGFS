package com.example.srikanth.cmgfsiitm;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.example.srikanth.cmgfsiitm.adapters.FacilityViewPagerAdapter;

public class FacilityActivity extends AppCompatActivity {

    ViewPager viewPager;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facility_activity);


        Intent intent=getIntent();
        String type=intent.getStringExtra("FacilityType");
        viewPager= (ViewPager) findViewById(R.id.facility_viewpager);
        FacilityViewPagerAdapter adapter = new FacilityViewPagerAdapter(getSupportFragmentManager());
        adapter.setFacilityType(type);
        viewPager.setAdapter(adapter);
    }
}
