package com.example.listvaccinerealtimeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity  {
    private EditText editName;
    private Spinner spinStatus;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.name_edit);
        spinStatus = findViewById(R.id.status_spin);
        btnSubmit = findViewById(R.id.submit_btn);
        DAOList daoList = new DAOList();

        initStatsSpin();
        initFilter();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editName.getText().toString().equals("")) {
                    editName.setError("Empty Name");
                } else if (spinStatus.getSelectedItemPosition() == 0) {
                    ((TextView)spinStatus.getSelectedView()).setError("Error message");
                    Toast.makeText(MainActivity.this, "Select Status", Toast.LENGTH_SHORT).show();
                } else {
                    if (editName.getError() == null && spinStatus.getSelectedItemPosition() > 0) {
                        List emp = new List(editName.getText().toString(), spinStatus.getSelectedItem().toString());
                        daoList.add(emp).addOnSuccessListener(suc->
                        {
                            Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                        }).addOnFailureListener(er->
                        {
                            Toast.makeText(MainActivity.this, "" +er.getMessage(), Toast.LENGTH_SHORT).show();
                        });
                    }
                    editName.setText("");
                    spinStatus.setSelection(0);
                }
            }
        });
    }

    private void initFilter() {
        InputFilter filter = new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; ++i)
                {
                    if (!Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ]*").matcher(String.valueOf(source.charAt(i))).matches())
                    {
                        return "";
                    }
                }

                return null;
            }
        };

        editName.setFilters(new InputFilter[]{filter,new InputFilter.LengthFilter(100)});
    }

    private void initStatsSpin() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.status, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinStatus.setAdapter(adapter);
    }
}