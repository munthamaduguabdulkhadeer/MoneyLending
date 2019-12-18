package com.example.android.instantloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Charges extends AppCompatActivity {
    TextView tx1,tx2,tx3,tx4,tx5,tx6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charges);
        tx1=findViewById(R.id.t1);
        tx2=findViewById(R.id.t2);
        tx3=findViewById(R.id.t3);
        tx4=findViewById(R.id.t4);
        tx5=findViewById(R.id.t5);
        tx6=findViewById(R.id.t6);
    }
    public void rate(View view) {

        Intent intent=new Intent(getApplicationContext(),rate.class);
        startActivity(intent);
    }

    public void process(View view) {

        Intent intent=new Intent(getApplicationContext(),process.class);
        startActivity(intent);
    }

    public void fee(View view) {

        Intent intent=new Intent(getApplicationContext(),onefees.class);
        startActivity(intent);
    }

    public void lost(View view) {

        Intent intent=new Intent(getApplicationContext(),lostcharge.class);
        startActivity(intent);
    }

    public void load(View view) {

        Intent intent=new Intent(getApplicationContext(),reloadfee.class);
        startActivity(intent);
    }

    public void late(View view) {

        Intent intent=new Intent(getApplicationContext(),latefee.class);
        startActivity(intent);
    }
}
