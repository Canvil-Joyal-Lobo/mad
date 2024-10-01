package com.example.test2;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    Button sub, add, multi, div;
    TextView Result;
    RadioGroup grp;
    Button Randomcolor;
    RadioButton r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editTextText);
        ed2 = findViewById(R.id.editTextText2);
        sub = findViewById(R.id.buttonsub);
        add = findViewById(R.id.buttonadd);
        multi = findViewById(R.id.buttonmutli);
        div = findViewById(R.id.buttondiv);
        Result = findViewById(R.id.textView4);
        Randomcolor = findViewById(R.id.Randomcolor); // Initializing Randomcolor button
        grp = findViewById(R.id.grp);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t1, t2, res;
                t1 = Integer.parseInt(ed1.getText().toString());
                t2 = Integer.parseInt(ed2.getText().toString());


                res = t1 + t2;
                Result.setText("Result=" + res);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t1, t2, res;
                t1 = Integer.parseInt(ed1.getText().toString());
                t2 = Integer.parseInt(ed2.getText().toString());
                res = t1 - t2;
                Result.setText("Result=" + res);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t1, t2, res;
                t1 = Integer.parseInt(ed1.getText().toString());
                t2 = Integer.parseInt(ed2.getText().toString());
                res = t1 * t2;
                Result.setText("Result=" + res);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t1, t2, res;
                t1 = Integer.parseInt(ed1.getText().toString());
                t2 = Integer.parseInt(ed2.getText().toString());
                res = t1 / t2;
                Result.setText("Result=" + res);
            }
        });
        Randomcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(220, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                getWindow().getDecorView().setBackgroundColor(color);
            }
        });
        grp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.r1) {
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                } else if (i == R.id.r2) {
                    getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                } else if (i == R.id.r3) {
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                }
            }
        });

    }
            }
