package com.ulul.planetpedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question7 extends AppCompatActivity {
    boolean []rules = new boolean[19];

    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question7);

        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);
        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");


//        btn_yes.setOnClickListener(this);
//        btn_no.setOnClickListener(this);
    }
    public void Ya(View view) {
        if((rules[1]==true||rules[2]==true)&&rules[6]==true&&rules[8]==true){
            rules[10]=true;
            Intent intent = new Intent(Question7.this, Result.class);
            intent.putExtra("rules",rules);
            startActivity(intent);

        }
        else {
            Intent intent = new Intent(Question7.this, Question8.class);
            intent.putExtra("rules",rules);
            startActivity(intent);
        }
    }
    public void Tidak(View view) {
        Intent intent = new Intent(Question7.this, Question8.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }
}
