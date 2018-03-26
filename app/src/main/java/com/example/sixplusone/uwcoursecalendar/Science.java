package com.example.sixplusone.uwcoursecalendar;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListAdapter;
        import android.widget.ListView;

public class Science extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);


        String[] scienceProgram = {"Biotechnology/Chartered Professional Accounting", "Biotechnology/Economics"
        , "Environmental Science", "Honours Science", "Life Sciences", "Physical Sciences", "Science and Aviation",
        "Science and Business"};
        ListAdapter artsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                scienceProgram);
        ListView sciListView = (ListView) findViewById(R.id.buckysListView);
        sciListView.setAdapter(artsAdapter);
    }
}
