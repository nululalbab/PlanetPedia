package com.ulul.planetpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private boolean []rules = new boolean[19];
    Button btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");

        TextView hasil;

        ImageView planet = (ImageView) findViewById(R.id.planet);
        String Shasil = "Tidak Ditemukan";
        if(rules[10]){
          Shasil="Merkurius";
          planet.setImageResource(R.drawable.merkurius);
        }
        if(rules[11]){
            Shasil="Venus";
            planet.setImageResource(R.drawable.venus);
        }
        if(rules[12]){
            Shasil="Bumi";
            planet.setImageResource(R.drawable.bumi);
        }
        if(rules[13]){
            Shasil="Mars";
            planet.setImageResource(R.drawable.mars);
        }
        if(rules[14]){
            Shasil="Jupiter";
            planet.setImageResource(R.drawable.jupiter);
        }
        if(rules[15]){
            Shasil="Saturnus";
            planet.setImageResource(R.drawable.saturnus);
        }
        if(rules[16]){
            Shasil="Uranus";
            planet.setImageResource(R.drawable.uranus);
        }
        if(rules[17]){
            Shasil="Neptunus";
            planet.setImageResource(R.drawable.neptunus);
        }
        if(rules[18]){
            Shasil="Pluto";
            planet.setImageResource(R.drawable.pluto);
        }

        hasil = (TextView)findViewById(R.id.hasil);
        hasil.setText(Shasil);
//        btn_home = (Button) findViewById(R.id.btn_home);
//        btn_home.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                finish();
//            }
//        });
//        Button btnReturn1 = (Button) findViewById(R.id.btnReturn1);


    }
    public void Back(View view) {
        Intent activityA = new Intent(getApplicationContext(), Question1.class);
        activityA.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(activityA);
    }
}
