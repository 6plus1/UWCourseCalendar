package com.example.sixplusone.uwcoursecalendar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nelson on 2018/03/26.
 */

public class CourseDataAdapter extends ArrayAdapter<CourseData> {
    private final Context context;
    private final List<CourseData> data;

    public CourseDataAdapter(@NonNull Context context, @NonNull List<CourseData> objects) {
        super(context, R.layout.course_row, objects);
        this.context = context;
        this.data = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.course_row, parent, false);
        TextView howManyOf = (TextView) rowView.findViewById(R.id.howManyOf);
        CheckBox box = (CheckBox) rowView.findViewById(R.id.rowText);

        CourseData thisRow = data.get(position);

        howManyOf.setText(thisRow.minRequired + " of");
        box.setText(listToString(thisRow.courses));

        return rowView;
    }

    private String listToString(List<String> list){
        String s = "";
        for(int i = 0; i != list.size(); ++i){
            s += list.get(i) + "\n";
        }
        return s;
    }
}
