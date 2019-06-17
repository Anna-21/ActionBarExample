package com.example.tae.actionbarexample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("New Title");
        actionBar.setLogo(android.R.drawable.btn_plus);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);

        //enables the dislay of home icon
        actionBar.setDisplayShowHomeEnabled(true);
    }
}
