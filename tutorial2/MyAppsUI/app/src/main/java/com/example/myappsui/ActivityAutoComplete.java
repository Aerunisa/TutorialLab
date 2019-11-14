package com.example.myappsui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;

public class ActivityAutoComplete extends Activity {
    AutoCompleteTextView autocmplt;
    String[] arr ={"Aeru","Thalia", "Nata", "Natasha", "Aerunisa"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_autocomplete);
        autocmplt = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,arr);
        autocmplt.setThreshold(2);
        autocmplt.setAdapter(adapter);
    }
}
