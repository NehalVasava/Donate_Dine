package com.example.nehal24;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class welcome2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2); // Replace with your layout file

        // Animation for "Reducing Waste, Nourishing Lives"
        TextView txtAnim = findViewById(R.id.txtAnim);

        // Create the fade-in animation
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(txtAnim, "alpha", 0f, 1f);
        fadeIn.setDuration(3000);

        // Create the scale-up animation
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(txtAnim, "scaleX", 0.8f, 1f);
        scaleX.setDuration(3000);
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(txtAnim, "scaleY", 0.8f, 1f);
        scaleY.setDuration(3000);

        // Create the translation animation
        ObjectAnimator translationY = ObjectAnimator.ofFloat(txtAnim, "translationY", -50f, 0f);
        translationY.setDuration(3000);

        // Combine all animations in an AnimatorSet
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(fadeIn, scaleX, scaleY, translationY);
        animatorSet.setInterpolator(new LinearInterpolator());

        // Start the animation
        txtAnim.setVisibility(View.VISIBLE); // Ensure the text view is visible
        animatorSet.start();

        // Animation for "How to Work"
        TextView howToWorkText = findViewById(R.id.textView10); // Replace with your actual TextView ID

        // Calculate screen width
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float screenWidth = displayMetrics.widthPixels;

        // Ensure the TextView starts at X = 0
        howToWorkText.setTranslationX(0f);

        // Create full-screen horizontal translation animation at a readable speed
        ObjectAnimator translateLeftToRight = ObjectAnimator.ofFloat(howToWorkText, "translationX", 0f, screenWidth - howToWorkText.getWidth());
        translateLeftToRight.setDuration(10000); // Adjusted duration to 10 seconds for readability
        translateLeftToRight.setInterpolator(new LinearInterpolator());
        translateLeftToRight.setRepeatCount(ObjectAnimator.INFINITE);
        translateLeftToRight.setRepeatMode(ObjectAnimator.RESTART); // Restart the animation after reaching the end

        translateLeftToRight.start();
    }

    public void rnej(View view) {
        startActivity(new Intent(welcome2Activity.this, MapActivity.class));
    }
}
