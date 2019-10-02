package com.ulul.planetpedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question6 extends AppCompatActivity {
    boolean []rules = new boolean[19];

    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question6);

        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);
        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");

//        btn_yes.setOnClickListener(this);
//        btn_no.setOnClickListener(this);
    }
    public void Ya(View view) {
        rules[8]=true;
        Intent intent = new Intent(Question6.this, Question7.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }
    public void Tidak(View view) {
        if(rules[2]==false&&rules[4]==true){
            rules[8]=false;
            rules[9]=true;
            Intent intent = new Intent(Question6.this, Question11.class);
            intent.putExtra("rules",rules);
            startActivity(intent);
        }
        else if(rules[2]==false&&rules[5]==true){
            rules[9]=true;
            rules[8]=false;
            Intent intent = new Intent(Question6.this, Question12.class);
            intent.putExtra("rules",rules);
            startActivity(intent);
        }else if(rules[6]&&!rules[8]){
            rules[9]=true;
            Intent intent = new Intent(Question6.this, Question10.class);
            intent.putExtra("rules",rules);
            startActivity(intent);
        }
        else if(rules[2]&&rules[7]){
            rules[9]=true;
            Intent intent = new Intent(Question6.this, Question14.class);
            intent.putExtra("rules",rules);
            startActivity(intent);
        }
        else {
            rules[9] = true;
            Intent intent = new Intent(Question6.this, Question7.class);
            intent.putExtra("rules", rules);
            startActivity(intent);
        }
    }
}
