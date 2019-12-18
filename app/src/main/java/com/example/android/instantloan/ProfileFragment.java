package com.example.android.instantloan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ProfileFragment extends Fragment {
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    public ProfileFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        return v;

    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){


        super.onViewCreated(view,savedInstanceState);
        textView1=view.findViewById(R.id.t1);
        textView2=view.findViewById(R.id.t2);
        textView3=view.findViewById(R.id.t3);
        textView4=view.findViewById(R.id.t4);
        textView5=view.findViewById(R.id.t5);
        textView6=view.findViewById(R.id.t6);
        textView7=view.findViewById(R.id.t7);
        textView8=view.findViewById(R.id.t8);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),loan.class);
                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),SmartCard.class);
                startActivity(intent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AddAddress.class);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BankAccount.class);
                startActivity(intent);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),EmiCalculator.class);
                startActivity(intent);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:00011112223"));
                startActivity(intent);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody="Your body here";
                String shareSub="Your Subject here";
                intent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
                intent.putExtra(Intent.EXTRA_TEXT,shareBody);

                startActivity(Intent.createChooser(intent,"Share Using"));
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),faq.class);
                startActivity(intent);
            }
        });

    }



}
