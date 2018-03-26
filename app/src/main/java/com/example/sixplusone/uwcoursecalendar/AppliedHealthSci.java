package com.example.sixplusone.uwcoursecalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class AppliedHealthSci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applied_health_sci);

        String[] apsProgram = {"Helath Studies", "Kinesiology", "Public Health", "Recreation and Sport " +
                "Business", "Therapeutic Recreation", "Tourism Development"};
        ListAdapter apsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                apsProgram);
        ListView apsListView = (ListView) findViewById(R.id.buckysListView);
        apsListView.setAdapter(apsAdapter);
    }
}
