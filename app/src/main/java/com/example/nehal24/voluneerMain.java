package com.example.nehal24;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class voluneerMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_voluneer_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void vp(View view) {
        startActivity(new Intent(voluneerMain.this, voluneerpr.class));

    }

    public void vp2(View view) {
        startActivity(new Intent(voluneerMain.this, ride.class));
    }

    public void vp6(View view) {
        startActivity(new Intent(voluneerMain.this, Allocation.class));

    }

    public void vp5(View view) {
        startActivity(new Intent(voluneerMain.this, check.class));
    }

    public void vp4(View view) {
        startActivity(new Intent(voluneerMain.this, availability.class));
    }

    public void vp3(View view) {
        startActivity(new Intent(voluneerMain.this, livetracking.class));
    }

    public void onMenuIconClick(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view, Gravity.END);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.menu_item, popupMenu.getMenu());
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onMenuItemClick(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.settings:
                        Toast.makeText(voluneerMain.this, "You have clicked on Settings", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.shares:
                        Toast.makeText(voluneerMain.this, "You have clicked on Share", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.Logout:
                        Toast.makeText(voluneerMain.this, "You have clicked on Logout", Toast.LENGTH_SHORT).show();
                        return true;

                    default:
                        return false;
                }
            }
        });
    }
    }
