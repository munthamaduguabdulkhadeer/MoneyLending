package com.example.android.instantloan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class HomeFragment extends Fragment {
    GridLayout maingrid;
    ImageView image1, image2;
    Button bt;
    TextView tx1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;

    }
       @Override
           public void onViewCreated(View view,@Nullable Bundle savedInstanceState){

        image1=view.findViewById(R.id.ig1);
        image2=view.findViewById(R.id.ig2);



        bt=view.findViewById(R.id.b1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Expense.class);
                startActivity(i);
            }
        });
           image1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i=new Intent(getActivity(),mobiles.class);
                   startActivity(i);
               }
           });
           image2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i=new Intent(getActivity(),Watches.class);
                   startActivity(i);
               }
           });


       }
    }

