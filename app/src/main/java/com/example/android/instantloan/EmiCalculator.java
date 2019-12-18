package com.example.android.instantloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EmiCalculator extends AppCompatActivity {
EditText amount,rate,time;
Button bt;
TextView tx1,tx2,tx3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi_calculator);
        amount=findViewById(R.id.e1);
        rate=findViewById(R.id.e2);
        time=findViewById(R.id.e3);
        bt=findViewById(R.id.b1);
        tx1=findViewById(R.id.t1);
        tx2=findViewById(R.id.t2);
        tx3=findViewById(R.id.t3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a= Integer.parseInt(amount.getText().toString());
                int b= Integer.parseInt(rate.getText().toString());
                int c= Integer.parseInt(time.getText().toString());

                int d;
                d=(a*b*c)/100;
                tx2.setText("Total Interest is:" + String.valueOf(d));
                int e=a+b;
                tx3.setText("Total Amount is:" + String.valueOf(e));




            }
        });
    }
}
