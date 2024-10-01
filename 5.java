package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    String tag="event";
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"hello");
        ed1=findViewById(R.id.editText);
        btn1=findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                String text=ed1.getText().toString();
                i.putExtra("data",text);
                startActivity(i);
            }
        });

    }
    public void onStart()
    {
        super.onStart();
        Log.d(tag,"In The onStart() event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag,"In The onResume() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag,"In The onPause() event");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag,"In The onRestart() event");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag,"In The onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag,"In The onDestroy() event");
    }
}
