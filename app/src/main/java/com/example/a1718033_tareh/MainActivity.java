package com.example.a1718033_tareh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void travel (View view)
    {
        Intent t = new Intent(MainActivity.this, profile.class);
        startActivity(t);
    }
}
