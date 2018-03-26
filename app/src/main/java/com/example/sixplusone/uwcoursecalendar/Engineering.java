package com.example.sixplusone.uwcoursecalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);

        String[] engProgram = {"Architectural Engineering", "Architecture", "Biomedical Engineering",
        "Chemical Engineering", "Civil Engineering", "Computer Engineering", "Electrical Engineering",
        "Environmental Engineering", "Geological Engineering", "Management Engineering",
        "Mechanical Engineering", "Mechatronics Engineering", "Nanotechnology Enginerring",
        "Software Engineering", "Systems Design Engineering"};
        ListAdapter engAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                engProgram);
        ListView artsListView = (ListView) findViewById(R.id.buckysListView);
        artsListView.setAdapter(engAdapter);
    }
}
