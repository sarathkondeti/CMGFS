package com.example.srikanth.cmgfsiitm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] eateries;

    String[] nonEateries;

    LinearLayout linearLayoutEateries;
    LinearLayout linearLayoutNonEateries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eateries = this.getResources().getStringArray(R.array.eateries);
        nonEateries = this.getResources().getStringArray(R.array.non_eateries);
        linearLayoutEateries=(LinearLayout) findViewById(R.id.linear_layout_eateries);
        linearLayoutNonEateries=(LinearLayout) findViewById(R.id.linear_layout_non_eateries);

        for(int i=0;i<eateries.length;i++){
            final TextView temp=new TextView(this);
            temp.setText(eateries[i]);
            temp.setPadding(0,8,0,0);
            temp.setTextSize(24);
            temp.setClickable(true);
            temp.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            temp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Toast.makeText(MainActivity.this,"blah"+temp.getText().toString(),Toast.LENGTH_SHORT).show();
                    Intent intent=null;
                    intent = new Intent(MainActivity.this,FacilityActivity.class);
                    intent.putExtra("FacilityName",temp.getText().toString());
                    intent.putExtra("FacilityType","Eatery");
                    startActivity(intent);
                }
            });
            linearLayoutEateries.addView(temp);
        }


        for(int i=0;i<nonEateries.length;i++){
            final TextView temp=new TextView(this);
            temp.setText(nonEateries[i]);
            temp.setPadding(0,8,0,0);
            temp.setTextSize(24);
            temp.setClickable(true);
            temp.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            temp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Toast.makeText(MainActivity.this,"blah"+temp.getText().toString(),Toast.LENGTH_SHORT).show();
                    Intent intent=null;
                    intent = new Intent(MainActivity.this,FacilityActivity.class);
                    intent.putExtra("FacilityName",temp.getText().toString());
                    intent.putExtra("FacilityType","NonEatery");
                    startActivity(intent);

                }
            });
            linearLayoutNonEateries.addView(temp);
        }
    }



}
