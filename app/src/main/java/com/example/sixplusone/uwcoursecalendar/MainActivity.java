package com.example.sixplusone.uwcoursecalendar;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListAdapter;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] faculties = {"Applied Health Sciences", "Arts",
                "Engineering", "Environment", "Mathematics", "Science"};
        ListAdapter buckysAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, faculties);
        ListView buckysListView = (ListView) findViewById(R.id.buckysListView);
        buckysListView.setAdapter(buckysAdapter);

        buckysListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String faculty = String.valueOf(parent.getItemAtPosition(position));
//                        Toast.makeText(MainActivity.this, faculty, Toast.LENGTH_LONG).show();
                        if (faculty == "Arts"){
                            click(view, "Arts");
                        }
                        else if(faculty == "Science"){
                            click(view, "Science");
                        } else if(faculty == "Mathematics") {
                            click(view, "Math");
                        } else if(faculty == "Environment") {
                            click(view, "Environment");
                        } else if(faculty == "Engineering") {
                            click(view, "Engineering");
                        } else if(faculty == "Applied Health Sciences") {
                            click(view, "AppliedHealthSci");
                        }
                    }
                }
        );

    }

    public void click(View view,String i){
        if (i == "Arts") {
            Intent[] array = {new Intent(MainActivity.this, Arts.class)};
            startActivities(array);
        }
        else if (i == "Science"){
            Intent[] array = {new Intent(MainActivity.this, Science.class)};
            startActivities(array);
        } else if(i == "Math") {
            Intent[] array = {new Intent(MainActivity.this, Math.class)};
            startActivities(array);
        } else if(i == "Environment") {
            Intent[] array = {new Intent(MainActivity.this, Environment.class)};
            startActivities(array);
        } else if(i == "Engineering") {
            Intent[] array = {new Intent(MainActivity.this, Engineering.class)};
            startActivities(array);
        } else if(i == "AppliedHealthSci") {
            Intent[] array = {new Intent(MainActivity.this, AppliedHealthSci.class)};
            startActivities(array);
        }

    }
}




