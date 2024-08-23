package com.example.nehal24;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class log_ngo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_ngo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void registerClick(View view) {

        startActivity(new Intent(log_ngo.this, regi_ngo.class));
    }

    public void pal(View view) {
        startActivity(new Intent(log_ngo.this, NGOHomeActivity.class));
    }

    public void komal4(View view) {
        Intent intent = new Intent(log_ngo.this, forgotpass.class);
        startActivity(intent);
    }
}