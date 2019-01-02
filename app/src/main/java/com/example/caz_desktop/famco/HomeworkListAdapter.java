package com.example.caz_desktop.famco;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HomeworkListAdapter extends BaseAdapter {

    LayoutInflater mInflator;
    Map<String, Double> map;
    List<String> description;
    List<String> dueDate;

    public HomeworkListAdapter(Context c, Map m){
        mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        map = m;
        description = new ArrayList<String>(map.keySet());
        dueDate = new ArrayList<String>(map.keySet());
    }

    @Override
    public int getCount() {
        return map.size();
    }

    @Override
    public Object getItem(int position) {
        return description.get(position); //
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflator.inflate(R.layout.homework_list_layout, null);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.homeworkDescriptionCheckedTextView);
        TextView dueDateTextView = (TextView) v.findViewById(R.id.homeworkDateField);


        descriptionTextView.setText(description.get(position));
        dueDateTextView.setText(dueDate.get(position));



        return v;
    }




}
