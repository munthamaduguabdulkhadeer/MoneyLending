package com.example.android.instantloan;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Order extends AppCompatActivity {
    Button bt;
    EditText ed1,ed2,ed3,ed4,ed5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        bt=findViewById(R.id.b1);
        ed1=findViewById(R.id.e1);
        ed2=findViewById(R.id.e2);
        ed3=findViewById(R.id.e3);
        ed4=findViewById(R.id.e4);
        ed5=findViewById(R.id.e5);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ordered Successfully",Toast.LENGTH_SHORT).show();


            }
        });

    }
}
