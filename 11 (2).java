package com.example.test11;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity3 extends AppCompatActivity {
    Button fadeBtn, rotateBtn, zoomBtn, blinkBtn;
    ImageView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.imageView3);
        fadeBtn = findViewById(R.id.button7);
        rotateBtn = findViewById(R.id.button8);
        zoomBtn = findViewById(R.id.button9);
        blinkBtn = findViewById(R.id.button10);
// Fade Animation
        fadeBtn.setOnClickListener(v -> {
            Animation fade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            textView.startAnimation(fade);
        });
// Rotate Animation
        rotateBtn.setOnClickListener(v -> {
            Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
            textView.startAnimation(rotate);
        });


// Zoom Animation
        zoomBtn.setOnClickListener(v -> {
            Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
            textView.startAnimation(zoom);
        });
// Blink Animation
        blinkBtn.setOnClickListener(v -> {
            Animation blink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
            textView.startAnimation(blink);
        });
    }
}