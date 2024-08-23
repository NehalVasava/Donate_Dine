package com.example.nehal24;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class voluneer_regi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_voluneer_regi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void nehal6(View view) {
        startActivity(new Intent(voluneer_regi.this, voluneer_log.class));
    }

    public void nehal7(View view) {
        startActivity(new Intent(voluneer_regi.this, voluneer_log.class));
    }

    public void raj(View view) {
        startActivity(new Intent(voluneer_regi.this, forgot_pass.class));
    }
}