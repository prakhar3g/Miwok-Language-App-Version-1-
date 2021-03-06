package com.example.prakharshakya.language;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number = (TextView)findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Open NUmbers",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
            }
        });

        TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Open Family Members",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,FamilyMemberActivity.class);
                startActivity(i);
            }
        });

        TextView colors= (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Open Colors",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i);
            }
        });

        TextView phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Open Phrases",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i);
            }
        });

    }
}