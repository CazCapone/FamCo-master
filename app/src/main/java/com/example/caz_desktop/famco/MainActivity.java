package com.example.caz_desktop.famco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        //start homework activity
        Button homeworkButton = (Button)findViewById(R.id.listsBtn);
        homeworkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeworkListIntent = new Intent(getApplicationContext(), HomeworkListAdapter.class);
                startActivity(homeworkListIntent);
            }
        });





    }








}
