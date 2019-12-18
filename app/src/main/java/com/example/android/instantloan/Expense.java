package com.example.android.instantloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Expense extends AppCompatActivity {
Button bt;
EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
        ed1=findViewById(R.id.e1);
        ed2=findViewById(R.id.e2);
        bt=findViewById(R.id.b1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Successfully Added",Toast.LENGTH_SHORT).show();


            }
        });
    }
}
