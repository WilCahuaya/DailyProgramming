package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerEjm extends AppCompatActivity implements View.OnClickListener {
    Button btnCalcular;
    EditText edtNum1,edtNum2;
    Spinner spnOperador;
    TextView txtResultado;
    String resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_ejm);
        btnCalcular=findViewById(R.id.btnCalcular);
        edtNum1=findViewById(R.id.edtNum1);
        edtNum2=findViewById(R.id.edtNum2);
        txtResultado=findViewById(R.id.txtResultado);
        spnOperador=findViewById(R.id.spnOper);

        btnCalcular.setOnClickListener(this);

        String [] listaSpiner={"Sumar","Restar","Multiplicar","Dividir"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,listaSpiner);
        spnOperador.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        String sNum1=edtNum1.getText().toString();
        String sNum2=edtNum2.getText().toString();

        int num1=Integer.parseInt(sNum1);
        int num2=Integer.parseInt(sNum2);

        String seleccion=spnOperador.getSelectedItem().toString();

        switch (seleccion){
            case "Sumar":{
                resultado=String.valueOf(num1+num2);
                txtResultado.setText(resultado);
                break;}

            case "Restar":{
                resultado=String.valueOf(num1-num2);
                txtResultado.setText(resultado);
                break;}

            case "Multiplicar":{
                resultado=String.valueOf(num1*num2);
                txtResultado.setText(resultado);
                break;}

            case "Dividir":{
                resultado=String.valueOf(num1/num2);
                txtResultado.setText(resultado);
                break;}

        }

    }
}