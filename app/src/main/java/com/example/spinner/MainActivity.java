package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSpinner;
    Toolbar toobrMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpinner=findViewById(R.id.btnSpinner);

        btnSpinner.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent iSpinner=new Intent(this,SpinnerEjm.class);
        startActivity(iSpinner);
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_activity_ejm,mimenu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem opcio_menu){
        int id=opcio_menu.getItemId();
        if(id==R.id.itmSpine){
            Intent iSpinner=new Intent(this,SpinnerEjm.class);
            startActivity(iSpinner);
            return true;
        }
        if(id==R.id.itmOpcion){
            Toast.makeText(this,"Opción",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(opcio_menu);
    }

}