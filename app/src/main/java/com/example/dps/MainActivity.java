package com.example.dps;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText em = (EditText) findViewById(R.id.m);
        EditText eul = (EditText) findViewById(R.id.ul);
        EditText eu1 = (EditText) findViewById(R.id.u1);
        EditText eu2 = (EditText) findViewById(R.id.u2);
        EditText eu3 = (EditText) findViewById(R.id.u3);
        Button zeichnen;
        zeichnen = (Button) findViewById(R.id.zeichnen);
        zeichnen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = em.getText().toString().trim();
                String ul = eul.getText().toString().trim();
                String u1 = eu1.getText().toString().trim();
                String u2 = eu2.getText().toString().trim();
                String u3 = eu3.getText().toString().trim();
                Bundle bundle = new Bundle();
                bundle.putString("m", m);
                bundle.putString("ul", ul);
                bundle.putString("u1", u1);
                bundle.putString("u2", u2);
                bundle.putString("u3", u3);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        Button vrg;
        vrg = (Button) findViewById(R.id.vrg);
        vrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });


    }

}