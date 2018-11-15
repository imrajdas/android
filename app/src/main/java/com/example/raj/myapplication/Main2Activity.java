package com.example.raj.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent in = getIntent();
        Bundle extras=  in.getExtras();

        T1 = (TextView) findViewById(R.id.tv1);
        T1.setText(extras.getString("name"));

    }

}
