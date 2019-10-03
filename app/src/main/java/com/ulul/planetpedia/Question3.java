package com.ulul.planetpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question3 extends AppCompatActivity {
    boolean []rules = new boolean[19];
    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);

        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);
        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");
//        btn_yes.setOnClickListener(this);
//        btn_no.setOnClickListener(this);
    }
    public void Ya(View view) {
        rules[4]=true;
        rules[5]=false;
        Intent intent = new Intent(Question3.this, Question5.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }
    public void Tidak(View view) {
        rules[4]=false;
        rules[5]=true;
        Intent intent = new Intent(Question3.this, Question5.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }
}
