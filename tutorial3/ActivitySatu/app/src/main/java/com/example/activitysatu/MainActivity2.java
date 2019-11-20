package com.example.activitysatu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends Activity {
    private TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        header = (TextView) findViewById(R.id.txtHeader);
    }

    public void launchSecondActivity(View view) {
// Membuat objek Intent
        Intent intent = new Intent(this, SecondActivity.class);
// Menjalankan Activity dengan parameter Intent
        startActivity(intent);
}
}
