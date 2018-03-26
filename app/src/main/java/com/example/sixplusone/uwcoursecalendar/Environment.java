package com.example.sixplusone.uwcoursecalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Environment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environment);

        String[] envProgram = {"Environment and Business", "Environment, Resources and Sustainability",
        "Geography and Aviation", "Geography and Environmental Management", "Geomatics", "International " +
                "Development", "Knowledge Integration", "Planning"};
        ListAdapter artsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                envProgram);
        ListView envListView = (ListView) findViewById(R.id.buckysListView);
        envListView.setAdapter(artsAdapter);
    }
}
