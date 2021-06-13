package org.techtown.diary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class health extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health);
        Button hbtn1, hbtn2, hbtn3, hbtn4, hbtn5, hbtn6;
        hbtn1 = (Button) findViewById(R.id.hbtn1);
        hbtn2 = (Button) findViewById(R.id.hbtn2);
        hbtn3 = (Button) findViewById(R.id.hbtn3);
        hbtn4 = (Button) findViewById(R.id.hbtn4);
        hbtn5 = (Button) findViewById(R.id.hbtn5);
        hbtn6 = (Button) findViewById(R.id.hbtn6);
        hbtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), health1.class );
                startActivity(intent);
            }
        });
        hbtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), health2.class );
                startActivity(intent);
            }
        });

        hbtn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), health3.class );
                startActivity(intent);
            }
        });

        hbtn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), health4.class );
                startActivity(intent);
            }
        });

        hbtn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), health5.class );
                startActivity(intent);
            }
        });

        hbtn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), health6.class );
                startActivity(intent);
            }
        });










    }
}
