package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnToast, btnMin, btnCount, btnReset;
    private TextView txtCount;
    private int numCount = 0;

    private void initUI() {
        btnToast = findViewById(R.id.toast_btn);
        btnMin = findViewById(R.id.min_btn);
        btnCount = findViewById(R.id.count_btn);
        btnReset = findViewById(R.id.reset_btn);
        txtCount = findViewById(R.id.count_txt);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "This is a Toast Button";
                Toast toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numCount--;
                if(txtCount !=null)
                    txtCount.setText(Integer.toString(numCount));
            }
        });

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numCount++;
                if(txtCount !=null)
                    txtCount.setText(Integer.toString(numCount));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numCount = numCount * 0;
                if(txtCount !=null)
                    txtCount.setText(Integer.toString(numCount));
            }
        });
    }

}
