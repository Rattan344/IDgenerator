 package com.example.genid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

 public class finalviewcard extends AppCompatActivity {
    TextView tvName, tvClass, tvFatherName, tvMotherName, tvMobile, tvAddress;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalviewcard);
//
//
//        // Set up the Toolbar
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        // Ensure ActionBar is not null before setting home as up
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true); }// Enable the back button

//        // Get the selected layout from the intent
//        Intent intent = getIntent();
//        int selectedLayout = intent.getIntExtra("layout_id", R.layout.id_layout_1); // default to id_layout_1
//
//        // Dynamically set the layout based on the user selection
//        setContentView(selectedLayout);


        // Get the selected layout
        int layout = getIntent().getIntExtra("layout", 1);

        // Set content based on layout selected
        if (layout == 1) {
            setContentView(R.layout.id_layout_1);
        } else if (layout == 2) {
            setContentView(R.layout.id_layout_2);
        } else {
            setContentView(R.layout.id_layout_3);
        }

        // Initialize views from the selected layout
        tvName = findViewById(R.id.tv_name);
        tvClass = findViewById(R.id.tv_class);
        tvFatherName = findViewById(R.id.tv_father_name);
        tvMotherName = findViewById(R.id.tv_mother_name);
        tvMobile = findViewById(R.id.tv_mobile);
        tvAddress = findViewById(R.id.tv_address);

        // Get data from IDLayoutsActivity
        String name = getIntent().getStringExtra("name");
        String studentClass = getIntent().getStringExtra("class");
        String fatherName = getIntent().getStringExtra("father_name");
        String motherName = getIntent().getStringExtra("mother_name");
        String mobile = getIntent().getStringExtra("mobile");
        String address = getIntent().getStringExtra("address");

        // Set data to the views
        tvName.setText(name);
        tvClass.setText(studentClass);
        tvFatherName.setText(fatherName);
        tvMotherName.setText(motherName);
        tvMobile.setText(mobile);
        tvAddress.setText(address);
    }
}