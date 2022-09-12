package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;

public class SpinnerEjm extends AppCompatActivity {
    Button btnCalcular;
    EditText edtNum1,edtNum2;
    View spnOperador;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_ejm);
        btnCalcular=findViewById(R.id.btnCalcular);
        edtNum1=findViewById(R.id.edtNum1);
        edtNum2=findViewById(R.id.edtNum2);
        txtResultado=findViewById(R.id.txtResultado);
        spnOperador=findViewById(R.id.spinner);

        String [] listaSpiner={"sumar","Restar","Multiplicar","Dividir"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,listaSpiner);
    }
}