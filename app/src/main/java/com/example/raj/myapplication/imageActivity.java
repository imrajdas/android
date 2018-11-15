package com.example.raj.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class imageActivity extends AppCompatActivity {

    Button b1, b2, b3;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        imageView = findViewById(R.id.imgv1);
        b1 = (Button) findViewById(R.id.cam);
        b2 = (Button) findViewById(R.id.map);
        b3 = (Button) findViewById(R.id.phone);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,1);
            }


        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u1 = Uri.parse("geo:?q=delhi");
                Intent i1 = new Intent(Intent.ACTION_VIEW, u1);
                startActivity(i1);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u2 = Uri.parse("tel:9954302836");
                Intent i2 = new Intent(Intent.ACTION_VIEW, u2);
                startActivity(i2);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        Bitmap bm = (Bitmap) data.getExtras().get("data");
        imageView.setImageBitmap(bm);
    }
}
