package com.example.test11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button Bt1;
    Button Bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bt1 = findViewById(R.id.Bt1);
        Bt2 = findViewById(R.id.Bt2);
        Bt1.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(i);
        });
        Bt2.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(i);
        });
    }
}