package com.example.caz_desktop.famco;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.LinkedHashMap;
import java.util.Map;

public class HomeworkListActivity extends AppCompatActivity {

    //Homework sql data
    HomeworkListAdapter homeworkListAdapter;
    Context thisContext;
    ListView homeworkListView;
    Map<String, String> homeworkMap = new LinkedHashMap<String, String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework_list);


        //Homework Activity
        Resources res = getResources();
        homeworkListView = (ListView)findViewById(R.id.homeworkListView);
        thisContext = this;

        homeworkMap.put("test", "test2");


        FloatingActionButton addHomework = (FloatingActionButton)findViewById(R.id.addHwFab);
        addHomework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addHomeworkIntent = new Intent(getApplicationContext(), AddHomeworkActivity.class);
                startActivity(addHomeworkIntent);
            }
        });


//test
    }









}
