package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpinner=findViewById(R.id.btnSpinner);

        btnSpinner.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent iSpinner=new Intent(this,Spinner.class);
        startActivity(iSpinner);
    }
}