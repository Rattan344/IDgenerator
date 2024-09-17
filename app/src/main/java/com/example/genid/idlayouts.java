package com.example.genid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toolbar;

public class idlayouts extends AppCompatActivity {
// this is the third activity where user will select different layout after entering the data


    Button layout1Btn, layout2Btn, layout3Btn;
    String name, studentClass, fatherName, motherName, mobile, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idlayouts);
        // Set up the Toolbar
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        // Ensure ActionBar is not null before setting home as up
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true); }// Enable the back button

        // Get data from MainActivity
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        studentClass = intent.getStringExtra("class");
        fatherName = intent.getStringExtra("father_name");
        motherName = intent.getStringExtra("mother_name");
        mobile = intent.getStringExtra("mobile");
        address = intent.getStringExtra("address");

        // Layout selection buttons
        layout1Btn = findViewById(R.id.btn_layout_1);
        layout2Btn = findViewById(R.id.btn_layout_2);
        layout3Btn = findViewById(R.id.btn_layout_3);

        // When a layout is selected, go to the IDCardActivity with the layout choice
        layout1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToIDCardActivity(1);
            }
        });

        layout2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToIDCardActivity(2);
            }
        });

        layout3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToIDCardActivity(3);
            }
        });
    }

    // Method to move to IDCardActivity with selected layout
    private void moveToIDCardActivity(int layoutNumber) {
        Intent intent = new Intent(idlayouts.this, finalviewcard.class);
        intent.putExtra("name", name);
        intent.putExtra("class", studentClass);
        intent.putExtra("father_name", fatherName);
        intent.putExtra("mother_name", motherName);
        intent.putExtra("mobile", mobile);
        intent.putExtra("address", address);
        intent.putExtra("layout", layoutNumber);
        startActivity(intent);
    }
}