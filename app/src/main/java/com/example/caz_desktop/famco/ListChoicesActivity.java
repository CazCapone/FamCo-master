package com.example.caz_desktop.famco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListChoicesActivity extends AppCompatActivity {


    //NOTHING HAS BEEN DONE TO THIS ACTIVITY


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_choices);

        //Homework list
        Button homeworkListButton = (Button)findViewById(R.id.homeworkBtn);
        homeworkListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeworklistsIntent = new Intent(getApplicationContext(), HomeworkListActivity.class);
                startActivity(homeworklistsIntent);
            }
        });






/*


        //Project list **must change Intent adapter
        Button projectListButton = (Button)findViewById(R.id.projectsBtn);
        projectListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent projectListsIntent = new Intent(getApplicationContext(), HomeworkListAdapter.class);
                startActivity(projectListsIntent);
            }
        });

        //To-Do list **must change Intent adapter
        Button todoListButton = (Button)findViewById(R.id.todoBtn);
        todoListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent todoListsIntent = new Intent(getApplicationContext(), HomeworkListAdapter.class);
                startActivity(todoListsIntent);
            }
        });

        //Shopping list **must change Intent adapter
        Button shoppingListButton = (Button)findViewById(R.id.shoppingListBtn);
        shoppingListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoppingListsIntent = new Intent(getApplicationContext(), HomeworkListAdapter.class);
                startActivity(shoppingListsIntent);
            }
        });

        //Custom list **must change Intent adapter
        Button customListButton = (Button)findViewById(R.id.customListBtn);
        customListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customListsIntent = new Intent(getApplicationContext(), HomeworkListAdapter.class);
                startActivity(customListsIntent);
            }
        });


        */
    }
}
