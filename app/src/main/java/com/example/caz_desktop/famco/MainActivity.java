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

        //Open Lists Activities
        Button listButton = (Button)findViewById(R.id.listsBtn);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listsIntent = new Intent(getApplicationContext(), ListChoicesActivity.class);
                startActivity(listsIntent);
            }
        });








/*
        //Open Share Activities
        Button shareButton = (Button)findViewById(R.id.shareBtn);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(getApplicationContext(), ShareFileActivity.class);
                startActivity(shareIntent);
            }
        });

        //Must Create
        Button chatButton = (Button)findViewById(R.id.chatBtn);
        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatIntent = new Intent(getApplicationContext(), ShareFileActivity.class);
                startActivity(chatIntent);
            }
        });

        //Must Create
        Button dinnerButton = (Button)findViewById(R.id.dinnerBtn);
        dinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dinnerIntent = new Intent(getApplicationContext(), ShareFileActivity.class);
                startActivity(dinnerIntent);
            }
        });

        //Must Create
        Button calendarButton = (Button)findViewById(R.id.calendarBtn);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calendarIntent = new Intent(getApplicationContext(), ShareFileActivity.class);
                startActivity(calendarIntent);
            }
        });

        //Must Create
        Button gpsButton = (Button)findViewById(R.id.gpsBtn);
        gpsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gpsIntent = new Intent(getApplicationContext(), ShareFileActivity.class);
                startActivity(gpsIntent);
            }
        });

        //Must Create
        Button manageButton = (Button)findViewById(R.id.manageBtn);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manageIntent = new Intent(getApplicationContext(), ShareFileActivity.class);
                startActivity(manageIntent);
            }
        });
*/

    }








}
