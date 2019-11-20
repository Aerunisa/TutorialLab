package com.example.activitysatu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityProses extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        TextView result = (TextView)findViewById(R.id.vHasil);
        Intent intent = getIntent();
        String addition = (String)intent.getSerializableExtra("jumlah");
        result.setText(addition);
    }
}
