package com.example.genid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
// in this activity the user will add the data to fields and go to idlayout acitvity

    EditText etName, etClass, etFatherName, etMotherName, etMobile, etAddress;
    Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initialize EditText fields
        etName = findViewById(R.id.et_name);
        etClass = findViewById(R.id.et_class);
        etFatherName = findViewById(R.id.et_father_name);
        etMotherName = findViewById(R.id.et_mother_name);
        etMobile = findViewById(R.id.et_mobile);
        etAddress = findViewById(R.id.et_address);

        // Initialize the Create button
        btnCreate = findViewById(R.id.create);

        // Set up the Create button listener
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered data
                String name = etName.getText().toString();
                String studentClass = etClass.getText().toString();
                String fatherName = etFatherName.getText().toString();
                String motherName = etMotherName.getText().toString();
                String mobile = etMobile.getText().toString();
                String address = etAddress.getText().toString();

                // Pass the data to the next activity (IdLayoutsActivity)
                Intent intent = new Intent(MainActivity.this, idlayouts.class);
                intent.putExtra("name", name);
                intent.putExtra("studentClass", studentClass);
                intent.putExtra("fatherName", fatherName);
                intent.putExtra("motherName", motherName);
                intent.putExtra("mobile", mobile);
                intent.putExtra("address", address);
                startActivity(intent);
            }
        });
//
//        // Set up the Toolbar
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        // Ensure ActionBar is not null before setting home as up
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true); }// Enable the back button

    }
}