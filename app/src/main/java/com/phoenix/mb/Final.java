package com.phoenix.mb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class Final extends AppCompatActivity {

    ImageView imageViewFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        //hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        //imageView
        imageViewFinal = findViewById(R.id.imageViewFinal);
        String url = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/logo.png?alt=media&token=6a0235bb-b05d-4da9-b0e4-df9a404326a7";
        Glide.with(this)
                .load(url)
                .into(imageViewFinal);
    }
}
