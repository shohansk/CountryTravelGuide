package com.example.countrytravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladeshButton,indiaButton,nepalButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton = findViewById(R.id.bangladeshButton);
        indiaButton = findViewById(R.id.indiaButton);
        nepalButton = findViewById(R.id.nepalButton);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        nepalButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.bangladeshButton) {

            intent =new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }

        if(v.getId()==R.id.indiaButton) {

            intent =new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }

        if(v.getId()==R.id.nepalButton) {

            intent =new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","nepal");
            startActivity(intent);
        }




    }
}