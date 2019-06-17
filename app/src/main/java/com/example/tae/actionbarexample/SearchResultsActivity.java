package com.example.tae.actionbarexample;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SearchResultsActivity extends AppCompatActivity {

    private TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        ActionBar actionBar = getSupportActionBar() ;

        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setTitle("SearchActivity");

        textView = findViewById(R.id.textQuery);

        handleIntent (getIntent());


    }

    @Override
    protected void onNewIntent(Intent intent) {

        setIntent(intent);
        handleIntent (getIntent());
        super.onNewIntent(intent);
    }

    private void handleIntent(Intent intent) {

        //ACTION_SEARCH is a static valure in an intent.
        if (Intent.ACTION_SEARCH.equals((intent.getAction()))){
            String query =  intent.getStringExtra(SearchManager.QUERY);
            textView.setText("The query is" + query);


        }
    }
}
