package com.example.android.instantloan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Payments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
    }
    public void repay(View view) {
        Intent intent=new Intent(getApplicationContext(),dorepay.class);
        startActivity(intent);
    }

    public void dont(View view) {

        Intent intent=new Intent(getApplicationContext(),dontpay.class);
        startActivity(intent);
    }
}
