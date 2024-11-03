package com.example.asynctask2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddItemActivity extends AppCompatActivity {
    private EditText editName, editPrice, editDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        editName = findViewById(R.id.edit_name);
        editPrice = findViewById(R.id.edit_price);
        editDescription = findViewById(R.id.edit_description);
        Button buttonSave = findViewById(R.id.button_save);

        buttonSave.setOnClickListener(v -> {
            String name = editName.getText().toString();
            String price = editPrice.getText().toString();
            String description = editDescription.getText().toString();

            // Zapisz dane do bazy lub listy
            saveData(name, price, description);
            finish(); // Powrót do poprzedniej aktywności
        });
    }

    private void saveData(String name, String price, String description) {
        // Tutaj implementacja zapisu danych
    }
}
