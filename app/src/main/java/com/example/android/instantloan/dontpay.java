package com.example.android.instantloan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class dontpay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dontpay);
    }
    public void YES(View view) {
        Toast.makeText(getApplicationContext(),"Thanks for your Feedback",Toast.LENGTH_SHORT).show();
    }

    public void NO(View view) {
        Toast.makeText(getApplicationContext(),"Thanks for your Feedback",Toast.LENGTH_SHORT).show();
    }
}
