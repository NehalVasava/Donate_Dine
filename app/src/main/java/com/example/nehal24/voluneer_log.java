package com.example.nehal24;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class voluneer_log extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_voluneer_log);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void registerClick(View view) {
        startActivity(new Intent(voluneer_log.this, voluneer_regi.class));
    }

    public void komal0(View view) {
            Intent intent = new Intent(voluneer_log.this, forgotpass.class);
            startActivity(intent);
        }



    public void loginClick(View view) {
        startActivity(new Intent(voluneer_log.this, voluneerMain.class));
    }
}