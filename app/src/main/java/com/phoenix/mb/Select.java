package com.phoenix.mb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Objects;

public class Select extends AppCompatActivity {

    //firebase
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    mb mb;
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;

    Bundle bundle;
    TextView textViewType, textCartItemCount;

    //String
    String orderItem;
    String firstOrder;
    String secondOrder;
    String thirdOrder;
    String place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        //info from previous activity
        bundle = getIntent().getExtras();
        assert bundle != null;
        String dish = Objects.requireNonNull(bundle.getString("type")).trim();
        place = Objects.requireNonNull(bundle.getString("place")).trim();
        firstOrder = Objects.requireNonNull(bundle.getString("order")).trim();
        secondOrder = Objects.requireNonNull(bundle.getString("order2")).trim();
        thirdOrder = Objects.requireNonNull(bundle.getString("order3")).trim();

        //textView
        textViewType = findViewById(R.id.textViewType);
        textViewType.setText(dish);

        //Firebase
        listView = findViewById(R.id.listViewMenu);
        mb = new mb();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference(dish.trim());

        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

                String value = snapshot.getValue(String.class);
                arrayList.add(value);
                arrayAdapter = new ArrayAdapter<String>(Select.this, android.R.layout.simple_list_item_1, arrayList);
                listView.setAdapter(arrayAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        //get item
                        orderItem = (String) parent.getItemAtPosition(position);

                        //alert dialog
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Select.this);
                        alertDialog.setTitle("M&B");
                        alertDialog.setMessage("Do you want to make another order?");

                        alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(), Categories.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                intent.putExtra("type", place);
                                intent.putExtra("order", orderItem);
                                intent.putExtra("order2", firstOrder);
                                intent.putExtra("order3", secondOrder);
                                intent.putExtra("activity", "second");
                                startActivity(intent);
                            }
                        });

                        alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                nextActivity();
                            }
                        });
                        alertDialog.show();
                    }
                });
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void nextActivity(){

        Intent intent = new Intent(getApplicationContext(), Barcode.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("order", firstOrder);
        intent.putExtra("order2", secondOrder);
        intent.putExtra("order3", thirdOrder);
        intent.putExtra("Order", orderItem);
        intent.putExtra("type", place);
        startActivity(intent);

    }
}
