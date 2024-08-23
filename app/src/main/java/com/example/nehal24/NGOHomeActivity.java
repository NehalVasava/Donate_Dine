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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class NGOHomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngohome);
    }

    public void ngo1(View view) {
        startActivity(new Intent(NGOHomeActivity.this, ngo_profile.class));
    }

    public void nhel90(View view) {
        startActivity(new Intent(NGOHomeActivity.this, ngo_vision.class));
    }

    public void nehal57(View view) {
        startActivity(new Intent(NGOHomeActivity.this, ngo_fastival.class));
    }

    public void nehale(View view) {
        startActivity(new Intent(NGOHomeActivity.this, ngo_enevt.class));
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
                        Toast.makeText(NGOHomeActivity.this, "You have clicked on Settings", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.shares:
                        Toast.makeText(NGOHomeActivity.this, "You have clicked on Share", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.Logout:
                        Toast.makeText(NGOHomeActivity.this, "You have clicked on Logout", Toast.LENGTH_SHORT).show();
                        return true;

                    default:
                        return false;
                }
            }
        });
    }

    public void nk(View view) {
startActivity(new Intent(NGOHomeActivity.this, request.class));
    }

    public void nk2(View view) {
        startActivity(new Intent(NGOHomeActivity.this, ngo_history.class));
    }

    public void nk3(View view) {
        startActivity(new Intent(NGOHomeActivity.this, thanking_ngo.class));
    }


    public void vpl9(View view) {
        startActivity(new Intent(NGOHomeActivity.this, upcoming.class));
    }

    public void vbp3(View view) {
        startActivity(new Intent(NGOHomeActivity.this, callobration.class));
    }

    public void vbplk0(View view) {
        startActivity(new Intent(NGOHomeActivity.this, enmgenry.class));
    }

    public void nehalk(View view) {
        startActivity(new Intent(NGOHomeActivity.this, ngo_profile.class));
    }
}

