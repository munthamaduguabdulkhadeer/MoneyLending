package com.example.android.instantloan;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;

public class faq extends AppCompatActivity {
    GridLayout maingrid;
    android.widget.Toolbar toolbar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        maingrid=findViewById(R.id.grid);
        setSingleEvent(maingrid);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("FAQ");


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




    }

    private void setSingleEvent(GridLayout maingrid) {
        for(int i=0;i<maingrid.getChildCount();i++){
            CardView cardView= (CardView) maingrid.getChildAt(i);
            final int finall=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finall==0){
                        Intent intent=new Intent(getApplicationContext(),Apply.class);
                        startActivity(intent);
                    }
                    else if(finall==1){
                        Intent intent=new Intent(getApplicationContext(),Timings.class);
                        startActivity(intent);
                    }

                    else if(finall==2){
                        Intent intent=new Intent(getApplicationContext(),Charges.class);
                        startActivity(intent);
                    }

                    else if(finall==3){
                        Intent intent=new Intent(getApplicationContext(),CreditCard.class);
                        startActivity(intent);
                    }

                    else if(finall==4){
                        Intent intent=new Intent(getApplicationContext(),Documents.class);
                        startActivity(intent);
                    }

                    else if(finall==5){
                        Intent intent=new Intent(getApplicationContext(),Payments.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }


    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

}



