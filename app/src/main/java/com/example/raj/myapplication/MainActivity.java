package com.example.raj.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText E1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1 = (EditText) findViewById(R.id.ed1);
    }

    public void func1(View v){
        //Toast.makeText(this,"Hello"+ E1.getText(), Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        i.putExtra("name", E1.getText().toString());

        startActivity(i);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.signup:
                    Intent in = new Intent(MainActivity.this, signUpActivity.class);
                    startActivity(in);
                    break;
            case R.id.image:
                    Intent in1 = new Intent(this, imageActivity.class);
                    startActivity(in1);
                    break;

        }
        return true;
    }
}
