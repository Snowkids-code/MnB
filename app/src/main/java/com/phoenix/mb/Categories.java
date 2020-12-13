package com.phoenix.mb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class Categories extends AppCompatActivity {

    Bundle extras;

    ImageButton imageButtonIcedCoffee, imageButtonSmoothie, imageButtonBurger, imageButtonMuffin, imageButtonBF, imageButtonBagatelle, imageButtonCoffee, imageButtonSNW;

    //data from previous activity
    String firstOrder = "null";
    String secondOrder = "null";
    String thirdOrder = "null";
    String activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        //hide bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        //info from previous activity
        extras = getIntent().getExtras();
        assert extras != null;
        final String place = Objects.requireNonNull(extras.getString("type")).trim();
        activity = Objects.requireNonNull(extras.getString("activity")).trim();

        if (activity.equals("first")) {

            //ImageButtonIcedCoffee
            imageButtonIcedCoffee = findViewById(R.id.imageButtonIcedCoffee);
            String urlIC = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/mugg-bean-iced-coffee.jpg?alt=media&token=b6d54a9d-16af-40c4-9cab-6d69eec5567a";
            Glide.with(getApplicationContext())
                    .load(urlIC)
                    .into(imageButtonIcedCoffee);
            imageButtonIcedCoffee.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Iced Coffee");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonSmoothie
            imageButtonSmoothie = findViewById(R.id.imageButtonSmoothie);
            String urlI = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/smoothie.jpg?alt=media&token=450c70ae-15aa-4b28-9f5f-c62b4b9a516d";
            Glide.with(getApplicationContext())
                    .load(urlI)
                    .into(imageButtonSmoothie);
            imageButtonSmoothie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Smoothie");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonBurger
            imageButtonBurger = findViewById(R.id.imageButtonBurger);
            String urlB = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/burger.webp?alt=media&token=396eb9fc-b2fb-45c0-ac96-bde97e1805c0";
            Glide.with(getApplicationContext())
                    .load(urlB)
                    .into(imageButtonBurger);
            imageButtonBurger.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Burger");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonMuffin
            imageButtonMuffin = findViewById(R.id.imageButtonMuffin);
            String urlM = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/mugg-and-bean-coffee-and-muffin.jpg?alt=media&token=145a3605-3151-4a97-ac63-08d0b4a4f6d1";
            Glide.with(getApplicationContext())
                    .load(urlM)
                    .into(imageButtonMuffin);
            imageButtonMuffin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Muffin");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonBreakFast
            imageButtonBF = findViewById(R.id.imageButtonBF);
            String urlBF = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/Mugg-Bean-Breakfast-Cappuccino-724x1024.jpg?alt=media&token=c80624fb-eff7-41fd-b369-c59d4fc958ba";
            Glide.with(getApplicationContext())
                    .load(urlBF)
                    .into(imageButtonBF);
            imageButtonBF.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Breakfast");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonBagatelle
            imageButtonBagatelle = findViewById(R.id.imageButtonBagatelle);
            String urlBa = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/unnamed.jpg?alt=media&token=bf1d3bcb-7ddc-40a6-bd14-2081d936857c";
            Glide.with(getApplicationContext())
                    .load(urlBa)
                    .into(imageButtonBagatelle);
            imageButtonBagatelle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Bagatelle");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonCoffee
            imageButtonCoffee = findViewById(R.id.imageButtonCoffee);
            String urlCo = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/coffee.jpg?alt=media&token=2e13504a-3dab-41bd-8a3b-df8f52eed502";
            Glide.with(getApplicationContext())
                    .load(urlCo)
                    .into(imageButtonCoffee);
            imageButtonCoffee.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Coffee");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonSNW
            imageButtonSNW = findViewById(R.id.imageButtonSNW);
            String urlSNW = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/winsandsteak.jpg?alt=media&token=334e87ec-7381-474f-a2f6-4200434c8b02";
            Glide.with(getApplicationContext())
                    .load(urlSNW)
                    .into(imageButtonSNW);
            imageButtonSNW.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Wings");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

        }

        //cart
        else{

            //get value from previous activity
            extras = getIntent().getExtras();
            firstOrder = Objects.requireNonNull(extras.getString("order")).trim();
            secondOrder = Objects.requireNonNull(extras.getString("order2")).trim();
            thirdOrder = Objects.requireNonNull(extras.getString("order3")).trim();
//            Toast.makeText(getApplicationContext(), first, Toast.LENGTH_SHORT).show();

            //ImageButtonIcedCoffee
            imageButtonIcedCoffee = findViewById(R.id.imageButtonIcedCoffee);
            String urlIC = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/mugg-bean-iced-coffee.jpg?alt=media&token=b6d54a9d-16af-40c4-9cab-6d69eec5567a";
            Glide.with(getApplicationContext())
                    .load(urlIC)
                    .into(imageButtonIcedCoffee);
            imageButtonIcedCoffee.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Iced Coffee");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonSmoothie
            imageButtonSmoothie = findViewById(R.id.imageButtonSmoothie);
            String urlI = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/smoothie.jpg?alt=media&token=450c70ae-15aa-4b28-9f5f-c62b4b9a516d";
            Glide.with(getApplicationContext())
                    .load(urlI)
                    .into(imageButtonSmoothie);
            imageButtonSmoothie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Smoothie");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonBurger
            imageButtonBurger = findViewById(R.id.imageButtonBurger);
            String urlB = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/burger.webp?alt=media&token=396eb9fc-b2fb-45c0-ac96-bde97e1805c0";
            Glide.with(getApplicationContext())
                    .load(urlB)
                    .into(imageButtonBurger);
            imageButtonBurger.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Burger");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonMuffin
            imageButtonMuffin = findViewById(R.id.imageButtonMuffin);
            String urlM = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/mugg-and-bean-coffee-and-muffin.jpg?alt=media&token=145a3605-3151-4a97-ac63-08d0b4a4f6d1";
            Glide.with(getApplicationContext())
                    .load(urlM)
                    .into(imageButtonMuffin);
            imageButtonMuffin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Muffin");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonBreakFast
            imageButtonBF = findViewById(R.id.imageButtonBF);
            String urlBF = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/Mugg-Bean-Breakfast-Cappuccino-724x1024.jpg?alt=media&token=c80624fb-eff7-41fd-b369-c59d4fc958ba";
            Glide.with(getApplicationContext())
                    .load(urlBF)
                    .into(imageButtonBF);
            imageButtonBF.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Breakfast");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonBagatelle
            imageButtonBagatelle = findViewById(R.id.imageButtonBagatelle);
            String urlBa = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/unnamed.jpg?alt=media&token=bf1d3bcb-7ddc-40a6-bd14-2081d936857c";
            Glide.with(getApplicationContext())
                    .load(urlBa)
                    .into(imageButtonBagatelle);
            imageButtonBagatelle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Bagatelle");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonCoffee
            imageButtonCoffee = findViewById(R.id.imageButtonCoffee);
            String urlCo = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/coffee.jpg?alt=media&token=2e13504a-3dab-41bd-8a3b-df8f52eed502";
            Glide.with(getApplicationContext())
                    .load(urlCo)
                    .into(imageButtonCoffee);
            imageButtonCoffee.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Coffee");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });

            //ImageButtonSNW
            imageButtonSNW = findViewById(R.id.imageButtonSNW);
            String urlSNW = "https://firebasestorage.googleapis.com/v0/b/qualityconversations-5da4b.appspot.com/o/winsandsteak.jpg?alt=media&token=334e87ec-7381-474f-a2f6-4200434c8b02";
            Glide.with(getApplicationContext())
                    .load(urlSNW)
                    .into(imageButtonSNW);
            imageButtonSNW.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Categories.this, Select.class);
                    intent.putExtra("type", "Wings");
                    intent.putExtra("place", place);
                    intent.putExtra("order", firstOrder);
                    intent.putExtra("order2", secondOrder);
                    intent.putExtra("order3", thirdOrder);
                    startActivity(intent);
                }
            });


        }
    }
}
