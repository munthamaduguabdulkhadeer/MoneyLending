package com.example.android.instantloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreditCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card);
    }
    public void pin(View view) {

        Intent intent=new Intent(getApplicationContext(),pin.class);
        startActivity(intent);
    }

    public void modes(View view) {

        Intent intent=new Intent(getApplicationContext(),modes.class);
        startActivity(intent);
    }

    public void request(View view) {

        Intent intent=new Intent(getApplicationContext(),request.class);
        startActivity(intent);
    }

    public void use(View view) {

        Intent intent=new Intent(getApplicationContext(),use.class);

        startActivity(intent);
    }



}
