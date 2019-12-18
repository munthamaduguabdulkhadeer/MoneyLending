package com.example.android.instantloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loan extends AppCompatActivity {
EditText amount,time;
TextView amnt,tme,repay,taken;
Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);
        amount=findViewById(R.id.e1);
        time=findViewById(R.id.e2);
        amnt=findViewById(R.id.t1);
        tme=findViewById(R.id.t2);
        repay=findViewById(R.id.t3);
        taken=findViewById(R.id.t4);
        bt1=findViewById(R.id.b1);
        bt2=findViewById(R.id.b2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(amount.getText().toString());
                int b=Integer.parseInt(time.getText().toString());

                repay.setText( "Loan Amount:"+String.valueOf(a));
                taken.setText( "Time Taken"+String.valueOf(b));

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Pay.class);
                startActivity(i);
            }
        });
    }
}
