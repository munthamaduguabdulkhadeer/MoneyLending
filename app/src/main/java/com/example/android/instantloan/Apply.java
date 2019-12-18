package com.example.android.instantloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Apply extends AppCompatActivity {
    TextView tx1,tx2,tx3,tx4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
        tx1=findViewById(R.id.t1);
        tx2=findViewById(R.id.t2);
        tx3=findViewById(R.id.t3);
        tx4=findViewById(R.id.t4);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("FAQ");


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void test(View view) {

        Intent i=new Intent(getApplicationContext(),app.class);
        startActivity(i);
    }


    public void card(View view) {

        Intent i=new Intent(getApplicationContext(),crd.class);
        startActivity(i);
    }

    public void documents(View view) {

        Intent i=new Intent(getApplicationContext(),dms.class);
        startActivity(i);
    }

    public void refer(View view) {

        Intent i=new Intent(getApplicationContext(),ref.class);
        startActivity(i);
    }
}
