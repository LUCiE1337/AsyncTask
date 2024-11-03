package com.example.asynctask2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonShowAll = findViewById(R.id.button_show_all);
        Button buttonAddItem = findViewById(R.id.button_add_item);

        buttonShowAll.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShowAllActivity.class);
            startActivity(intent);
        });

        buttonAddItem.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddItemActivity.class);
            startActivity(intent);
        });
    }
}
