package com.example.myappsui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ActSpiner extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
        public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_spiner);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        List <String> categories = new ArrayList <String>();
        categories.add( " Automobile ");
        categories.add( " Business Services");
        categories.add( " Computers ");
        categories.add( " Education ");
        categories.add( " Personal ");
        categories.add( " Travel ");
        ArrayAdapter<String>  dataAdapter = new ArrayAdapter <String>(this,
                android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }
        @Override
        public void onItemSelected (AdapterView <?> parent, View view, int position, long id){
        String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),"Selected: "
        +item,
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {



    }
}
