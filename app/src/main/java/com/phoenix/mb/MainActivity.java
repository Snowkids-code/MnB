package com.phoenix.mb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    //xml
    ImageView imageViewBackground;
    TextView textViewBackground;
    Button buttonTakeAway, buttonEatIn;

    //data from previous activity
    Bundle extras;
    String firstOrder = "null";
    String secondOrder = "null";
    String thirdOrder = "null";
    String activity;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide bar.
        Objects.requireNonNull(getSupportActionBar()).hide();

        //textView
        textViewBackground = findViewById(R.id.textViewBackground);
        textViewBackground.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

        //ButtonTakeAway
        buttonTakeAway = findViewById(R.id.buttonTakeAway);
        buttonTakeAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Categories.class);
                intent.putExtra("type", "TakeAway");
                intent.putExtra("activity", "first");
                startActivity(intent);
            }
        });

        //buttonEatIn
        buttonEatIn = findViewById(R.id.buttonEatIn);
        buttonEatIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Categories.class);
                intent.putExtra("type", "Eat-In");
                intent.putExtra("activity", "first");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        this.finish();
    }
}
