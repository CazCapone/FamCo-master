package com.example.caz_desktop.famco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShareFileActivity extends AppCompatActivity {

    //NOTHING HAS BEEN DONE TO THIS ACTIVITY

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_file);








        //Share File **Sharefile adapter must be created
        Button shareFileButton = (Button)findViewById(R.id.shareFilesBtn);
        shareFileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareFileIntent = new Intent(getApplicationContext(), HomeworkListAdapter.class);
                startActivity(shareFileIntent);
            }
        });

        //Share Picture **Sharepicture adapter must be created
        Button sharePictureButton = (Button)findViewById(R.id.sharePictureBtn);
        sharePictureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharePictureIntent = new Intent(getApplicationContext(), HomeworkListAdapter.class);
                startActivity(sharePictureIntent);
            }
        });

        //Share Memory **Sharememory adapter must be created
        Button shareMemoryButton = (Button)findViewById(R.id.shareMemoryBtn);
        shareMemoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareMemoryIntent = new Intent(getApplicationContext(), HomeworkListAdapter.class);
                startActivity(shareMemoryIntent);
            }
        });
    }
}
