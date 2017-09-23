package com.example.srikanth.cmgfsiitm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.srikanth.cmgfsiitm.R;

/**
 * Created by srikanth on 19/09/17.
 */

public class EateryFormFragment extends android.support.v4.app.Fragment {

    Spinner spinner;
    private String facilityName;

    public EateryFormFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.eateries_eval, container, false);
        spinner = rootView.findViewById(R.id.spinner_eatery_form);
        ArrayAdapter<CharSequence> adapter;

        adapter = ArrayAdapter.createFromResource(getContext(), R.array.eateries, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    public void setFacilityName(String facilityName){
        this.facilityName=facilityName;
    }

}
