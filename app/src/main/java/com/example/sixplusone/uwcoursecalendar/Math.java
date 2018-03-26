package com.example.sixplusone.uwcoursecalendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);


        String[] mathProgram = {"Actuarial Science", "Applied Mathematics", "Business Administration and Computer Science Double Degree",
                "Business Administration and Mathematics Double Degree", "Combinatorics and Optimization", "Computational Mathematics", "Computer Science", "Computing" +
                " and Financial Management", "Data Science", "Mathematics/Business Administration", "Mathematics/" +
                "Charted Professional Accounting", "Mathematical Economics", "Mathematical Finance", "Mathematics/Financial Analysis and Risk" +
                " Management", "Mathematical Optimization", "Mathematical Physics", "Mathematics Teaching", "Pure" +
                " Mathematics", "Statistics", "Statistics for Health"};
        ListAdapter artsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                mathProgram);
        ListView mathListView = (ListView) findViewById(R.id.buckysListView);

        mathListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String clicked = (String) adapterView.getItemAtPosition(position);
                Intent details = new Intent(getBaseContext(), CourseDetails.class);
                if(clicked.equals("Computer Science")){
                    details.putExtra("program", "CS");
                    startActivity(details);
                }
            }
        });
        mathListView.setAdapter(artsAdapter);
    }
}