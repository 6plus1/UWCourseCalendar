package com.example.sixplusone.uwcoursecalendar;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListAdapter;
        import android.widget.ListView;

public class Arts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);
//        String[] programs = {"hey jude", "let it be",
//                "let her go", "vincent", "lost star", "say something"};
//        ListAdapter buckysAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, programs);
//        ListView buckysListView = (ListView) findViewById(R.id.buckysListView);
//        buckysListView.setAdapter(buckysAdapter);
////
////        buckysListView.setOnItemClickListener(
////                new AdapterView.OnItemClickListener(){
////                    @Override
////                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                        String program = String.valueOf(parent.getItemAtPosition(position));
//////                        Toast.makeText(MainActivity.this, program, Toast.LENGTH_LONG).show();
//////                        if (faculty == "Arts"){
//////                            click(view);
//////                        }
////                    }
////                }
////        );

        String[] artsProgram = {"Accounting and Financial Management", "Anthropology", "Classical Studies",
                "Computing and Financial Management", "Economics", "English", "Fine Arts", "French",
                "German", "Global Business and Digital Arts", "History", "Honours Arts", "Honours Arts and Business",
                "Legal Studies", "Liberal Studies", "Medieval Studies", "Music", "Peace and Conflict Studies",
                "Philosophy", "Political Science", "Psychology", "Religious Studies", "Sexuality, Marriage, and Family" +
                "Studies", "Social Development Studies", "Sociology", "Spanish", "Speech Communication",
                "Theatre and Performance", "Women's Studies"};
        ListAdapter artsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                artsProgram);
        ListView artsListView = (ListView) findViewById(R.id.buckysListView);
        artsListView.setAdapter(artsAdapter);
    }
}
