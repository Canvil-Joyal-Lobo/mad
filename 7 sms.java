package com.example.test71;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    Button sms,call,email,browser,map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        sms=findViewById(R.id.button);
        call=findViewById(R.id.button2);

        email=findViewById(R.id.button4);
        browser=findViewById(R.id.button5);
        map=findViewById(R.id.button6);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri smsuri=Uri.parse("smsto:9019826618");
                Intent smsintent=new Intent(Intent.ACTION_SENDTO,smsuri);
                startActivity(smsintent);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri calluri = Uri.parse("tel:9019826618");
                Intent callintent = new Intent(Intent.ACTION_DIAL, calluri);
                startActivity(callintent);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri emailuri = Uri.parse("mailto:23ca016.canvil@sjec.ac.in");
                Intent emailintent = new Intent(Intent.ACTION_SENDTO, emailuri);
                startActivity(emailintent);
            }
        });
        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri browseruri = Uri.parse("https://www.google.com/");
                Intent browserintent = new Intent(Intent.ACTION_VIEW, browseruri);
                startActivity(browserintent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri mapuri=Uri.parse("geo:0,0?q=St.JosephEngineerCollege,Mangalore");
                Intent mapintent=new Intent(Intent.ACTION_VIEW,mapuri);
                startActivity(mapintent);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}