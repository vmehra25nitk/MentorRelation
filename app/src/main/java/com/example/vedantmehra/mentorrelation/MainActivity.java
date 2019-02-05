package com.example.vedantmehra.mentorrelation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(MainActivity.this, MentorProfile.class);
        Toast.makeText(MainActivity.this, "Mentor Profile", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
