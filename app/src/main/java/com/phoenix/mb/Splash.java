package com.phoenix.mb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Splash extends AppCompatActivity {

    ImageView imageViewSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //get Image from firebase
        imageViewSplash = findViewById(R.id.imageViewSplash);
        String url = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/logo.png?alt=media&token=6a0235bb-b05d-4da9-b0e4-df9a404326a7";
        Glide.with(getApplicationContext())
                .load(url)
                .into(imageViewSplash);

        //Go to the next Activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("activity", "first");
                startActivity(intent);
            }
        }, 3000);
    }
}
