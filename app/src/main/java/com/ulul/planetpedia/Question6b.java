package com.ulul.planetpedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question6b extends AppCompatActivity {
    boolean []rules = new boolean[19];

    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question6b);

        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);
        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");

//        btn_yes.setOnClickListener(this);
//        btn_no.setOnClickListener(this);
    }
    public void Ya(View view) {
        if(rules[6]&&!rules[8]){
            rules[9]=true;
            Intent intent = new Intent(Question6b.this, Question10.class);
            intent.putExtra("rules",rules);
            startActivity(intent);
        }
        else if(rules[2]&&rules[7]){
            rules[9]=true;
            Intent intent = new Intent(Question6b.this, Question14.class);
            intent.putExtra("rules",rules);
            startActivity(intent);
        }
        else {
            rules[9] = true;
            Intent intent = new Intent(Question6b.this, Question7.class);
            intent.putExtra("rules", rules);
            startActivity(intent);
        }
    }
    public void Tidak(View view) {
            rules[9]=false;
            Intent intent = new Intent(Question6b.this, Question9.class);
            intent.putExtra("rules",rules);
            startActivity(intent);

    }
}
