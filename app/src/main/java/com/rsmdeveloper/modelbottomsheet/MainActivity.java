package com.rsmdeveloper.modelbottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;


/**
 * Created by RSM Developer on 29-05-2023.
 * Follow Facebook : https://www.facebook.com/RsmSoftLtd
 * Follow Facebook : https://www.facebook.com/RsmDeveloper
 * Subscribe YouTube : https://www.youtube.com/@RsmDeveloper
 * Visit Website : https://rsmdeveloper.blogspot.com/
 * GitHub: https://github.com/GmMamunH
 * Developed Your Creativity With RSM Developer
 **/
public class MainActivity extends AppCompatActivity {

    private Button bottomsheet;
    private BottomSheetDialog bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomsheet=findViewById(R.id.bottomsheet);

        bottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog=new BottomSheetDialog(MainActivity.this,R.style.BottomSheetTheme);
                View sheetview= LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottomsheetlayout,null);

                //<!--share-->//
                sheetview.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Share is Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                //<!--update-->//
                sheetview.findViewById(R.id.update).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Update is Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                //<!--rate-->
                sheetview.findViewById(R.id.rate).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Rate is Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                //<!--more-->
                sheetview.findViewById(R.id.more).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"More App is Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                //<!--new activity-->
                sheetview.findViewById(R.id.gotosecond).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }
                });



                bottomSheetDialog.setContentView(sheetview);
                bottomSheetDialog.show();


            }
        });


    }
}