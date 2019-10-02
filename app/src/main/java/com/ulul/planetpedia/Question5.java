package com.ulul.planetpedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question5 extends AppCompatActivity {
    boolean []rules = new boolean[19];
    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5);

        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);
        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");

//        btn_yes.setOnClickListener(this);
//        btn_no.setOnClickListener(this);
    }
    public void Ya(View view) {
        rules[6]=true;
        rules[7]=false;
        Intent intent = new Intent(Question5.this, Question9.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }
    public void Tidak(View view) {
        rules[7]=true;
        rules[6]=false;
        Intent intent = new Intent(Question5.this, Question6.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }
}
