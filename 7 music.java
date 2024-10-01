package com.example.test7;
import android.content.Intent; import android.os.Bundle; import android.view.View; import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity; import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.test7.backgroundService;

public class MainActivity extends AppCompatActivity { Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); EdgeToEdge.enable(this); setContentView(R.layout.activity_main); start=findViewById(R.id.start); stop=findViewById(R.id.stop);
        start.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
            Intent i=new Intent(MainActivity.this, backgroundService.class);
            startService(i); }
        });
        stop.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
            Intent i=new Intent(MainActivity.this,backgroundService.class);
            stopService(i); }
        }); }
}