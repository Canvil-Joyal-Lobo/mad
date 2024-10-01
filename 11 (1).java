package com.example.test11;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity2 extends AppCompatActivity {
    ImageView img;
    Button rect, squ, cir, line;
    Bitmap bp;
    Canvas c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img = findViewById(R.id.imageView);
        rect = findViewById(R.id.button3);
        squ = findViewById(R.id.button4);
        cir = findViewById(R.id.button5);
        line = findViewById(R.id.button6);
        bp = Bitmap.createBitmap(520, 1200, Bitmap.Config.ARGB_8888);

        img.setImageBitmap(bp);
        c = new Canvas(bp);
        rect.setOnClickListener(v -> {
            Paint p = new Paint();
            p.setColor(Color.BLUE);
            p.setTextSize(50);
            c.drawText("Rectangle", 10, 150, p);
            c.drawRect(30, 200, 200, 600, p);
        });
        squ.setOnClickListener(v -> {
            Paint p1 = new Paint();
            p1.setColor(Color.RED);
            p1.setTextSize(50);
            c.drawText("Square", 300, 150, p1);
            c.drawRect(250, 200, 480, 400, p1);
        });
        cir.setOnClickListener(v -> {
            Paint p2 = new Paint();
            p2.setColor(Color.MAGENTA);
            p2.setTextSize(50);
            c.drawText("Circle", 70, 700, p2);
            c.drawCircle(130, 860, 120, p2);
        });
        line.setOnClickListener(v -> {
            Paint p3 = new Paint();
            p3.setColor(Color.WHITE);
            p3.setTextSize(50);
            p3.setStrokeWidth(20);
            c.drawText("Line", 350, 700, p3);
            c.drawLine(350, 800, 800, 800, p3);
        });
    }
}