package com.ulul.planetpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

//    Button start;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

//        start = (Button) findViewById(R.id.btn_home);
    }
    public void Start(View view) {
        Intent intent = new Intent(Home.this, Question1.class);
        startActivity(intent);
    }
}
