package com.example.test5;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.test5.MainActivity3;

public class MainActivity2 extends AppCompatActivity {
    TextView ed1, ed2, ed3, ed4;
    String tag = "event";
    Button btn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(tag, "hello");
        ed1 = findViewById(R.id.editTextText1);
        ed2 = findViewById(R.id.editTextText2);
        ed3 = findViewById(R.id.editTextText3);
        ed4 = findViewById(R.id.editTextText4);
        btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                String text1 = ed1.getText().toString();
                i.putExtra("data1", text1);
                String text2 = ed2.getText().toString();
                i.putExtra("data2", text2);
                String text3 = ed3.getText().toString();
                i.putExtra("data3", text3);
                String text4 = ed4.getText().toString();
                i.putExtra("data4", text4);
                startActivity(i);
            }
        });
    }
}