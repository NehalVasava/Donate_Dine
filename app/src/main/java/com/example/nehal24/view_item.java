package com.example.nehal24;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class view_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item);


        EditText searchItem = findViewById(R.id.search_item);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button searchButton = findViewById(R.id.search_button);
        searchButton.setOnClickListener(v -> {
            String query = searchItem.getText().toString().trim();
            if (!query.isEmpty()) {
                Toast.makeText(view_item.this, "Searching for: " + query, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(view_item.this, "Please enter an item to search", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
