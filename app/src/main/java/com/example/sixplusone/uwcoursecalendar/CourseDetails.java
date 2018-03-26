package com.example.sixplusone.uwcoursecalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CourseDetails extends AppCompatActivity {

    private String getSelectedProgram(){
        Bundle extras = getIntent().getExtras();
        if(extras != null) return extras.getString("program");
        else return "None";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);
        String program = getSelectedProgram();
        CourseDataAdapter adapter = new CourseDataAdapter(this, CourseData.getCourseDataFor(program));
        ListView list = (ListView) findViewById(R.id.detailsListView);
        list.setAdapter(adapter);
    }
}
