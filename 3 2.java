package com.example.test5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity3 extends AppCompatActivity {
    TextView ed1,ed2,ed3,ed4;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ed1=findViewById(R.id.textview1);
        ed2=findViewById(R.id.textview2);
        ed3=findViewById(R.id.textview3);
        ed4=findViewById(R.id.textview4);
        btn2=findViewById(R.id.button2);
        String text1=getIntent().getStringExtra("data1");
        ed1.setText(text1);
        String text2=getIntent().getStringExtra("data2");
        ed2.setText(text2);
        String text3=getIntent().getStringExtra("data3");
        ed3.setText(text3);
        String text4=getIntent().getStringExtra("data4");
        ed4.setText(text4);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity3.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}