package com.rmhouse.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);

        EditText name = findViewById(R.id.name);
        EditText price = findViewById(R.id.price);
        ImageButton addBtn = findViewById(R.id.add_btn);
    }
}
