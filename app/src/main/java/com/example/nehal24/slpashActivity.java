package com.example.nehal24;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class slpashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_slpash);
        Intent iHome = new Intent(slpashActivity.this, welcome2Activity.class);

        new Handler().postDelayed(() -> startActivity(iHome),4000);
    }
    }
