package com.example.asynctask2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ShowAllActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

        listView = findViewById(R.id.list_view_items);
        itemList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        // Tutaj wstaw kod do załadowania danych z bazy
        loadData();
    }

    private void loadData() {
        // Symulacja danych
        itemList.add("Element 1");
        itemList.add("Element 2");
        itemList.add("Element 3");
        adapter.notifyDataSetChanged();
    }
}
