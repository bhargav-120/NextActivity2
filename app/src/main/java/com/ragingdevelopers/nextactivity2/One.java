package com.ragingdevelopers.nextactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class One extends AppCompatActivity {
    private EditText otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        otp = findViewById(R.id.editText3);
        otp.setText(getIntent().getExtras().getString("mobile"));
    }
}
