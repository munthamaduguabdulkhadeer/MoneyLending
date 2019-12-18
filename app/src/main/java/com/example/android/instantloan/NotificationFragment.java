package com.example.android.instantloan;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class NotificationFragment extends Fragment {
    ImageView img;
    AlertDialog dialog;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7;
    public NotificationFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_notification, container, false);
        return v;
    }

@Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState){

        img=view.findViewById(R.id.ig1);
        tx1=view.findViewById(R.id.t1);
    tx2=view.findViewById(R.id.t2);
    tx3=view.findViewById(R.id.t3);
    tx4=view.findViewById(R.id.t4);
    tx5=view.findViewById(R.id.t5);
    tx6=view.findViewById(R.id.t6);
    tx7=view.findViewById(R.id.t7);


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0)
                ;
            }
        });
        tx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(1);
            }
        });




}
@Override
    public void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
    Bitmap bitmap= (Bitmap) data.getExtras().get("data");
    img.setImageBitmap(bitmap);

}

}
