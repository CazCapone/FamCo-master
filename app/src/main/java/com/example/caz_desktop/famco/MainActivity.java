package com.example.caz_desktop.famco;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        //start homework activity
        Button homeworkButton = (Button)findViewById(R.id.homeworkBtn);
        homeworkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeworkListIntent = new Intent(getApplicationContext(), HomeworkListAdapter.class);
                startActivity(homeworkListIntent);
            }
        });





    }








}
