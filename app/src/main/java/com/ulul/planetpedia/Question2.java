package com.ulul.planetpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question2 extends AppCompatActivity {
    boolean []rules = new boolean[19];

    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);


        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);

        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");
//        if(rules[1]==true){
//            btn_yes.setText("HAHAHAHAHAHA");
//        }
//        else{
//            btn_yes.setText("Hehehehe");
//
//        }

//        btn_yes.setOnClickListener(this);
//        btn_no.setOnClickListener(this);
    }
    public void Ya(View view) {
        rules[2]=true;
        rules[3]=false;
            Intent intent = new Intent(Question2.this, Question5.class);
            intent.putExtra("rules",rules);
            startActivity(intent);


    }
    public void Tidak(View view) {
        rules[2]=false;
        rules[3]=true;
            Intent intent = new Intent(Question2.this, Question3.class);
            intent.putExtra("rules",rules);
            startActivity(intent);


    }
}
