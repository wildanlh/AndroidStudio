package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnFb, btnIg, btnGoogle, btnChap1, btnChap2, btnChap3, btnChap4, btnChap5;
    private ImageView image;
    private TextView text;

    private void initUI() {
        btnFb = findViewById(R.id.fb);
        btnIg = findViewById(R.id.ig);
        btnGoogle = findViewById(R.id.google);
        btnChap1 = findViewById(R.id.button1);
        btnChap2 = findViewById(R.id.button2);
        btnChap3 = findViewById(R.id.button3);
        btnChap4 = findViewById(R.id.button4);
        btnChap5 = findViewById(R.id.button5);
        image = findViewById(R.id.image1);
        text = findViewById(R.id.paragraph);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://wizardingworld.com/");
            }
        });

        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://facebook.com/harrypotterfilm/");
            }
        });

        btnIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl ( "https://instagram.com/harrypotterfilm/");
            }
        });

        btnChap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.harry1);
                text.setText(R.string.lorem1);
            }
        });

        btnChap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.harry2);
                text.setText(R.string.lorem2);
            }
        });

        btnChap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.harry3);
                text.setText(R.string.lorem3);
            }
        });

        btnChap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.harry4);
                text.setText(R.string.lorem4);
            }
        });

        btnChap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.harry5);
                text.setText(R.string.lorem5);
            }
        });
    }



    private void goToUrl(String s) {
        Uri uriUrl = Uri.parse(s);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
