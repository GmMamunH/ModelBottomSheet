#BottomSheetDialogGitHub

Implementing Bottom Sheet Dialogs using Android Studio || Bottom Sheet Dialog in Android studio || RSM Developer


Presenting brand new project:
In this project you will learn how to create bottom sheet dialog App in Android Studio. Just follow the steps in the project.
More project about Android Application Development will uploaded so get in touch with the channel. So you are no more far. You can be 
developer. 

====================================================
Step 1: Creating a new project
Open a new project.
We will be working on Empty Activity with language as Java. Leave all other options unchanged.
You can change the name of the project at your convenience.
There will be two default files named activity_main.xml and MainActivity.java.

======================================================================================

Step 2: Open res -> layout ->activity_main.xml (or) main.xml and add following code:

In this step we open an XML file and add the code :-

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#999999"
    android:gravity="center"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/bottomsheet"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        android:text="Show Bottom Sheet"
        android:textColor="@color/black"
        android:layout_gravity="center"
        android:textSize="20sp"
        android:backgroundTint="#FFACAC"
        />
    
</LinearLayout>

=================================================================================

Step 3: Create a New layout xml file (bottomsheetlayout) with language as Java :- Open ->res -> layout ->bottomsheetlayout.xml and add following code:

In this step we open an XML file and add the code :-

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical"
    android:background="@drawable/bottomsheetdesign"
    android:padding="10dp"
    android:layout_height="match_parent">


    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Your Items"
        android:textStyle="bold"
        android:textColor="@color/white"
        android:layout_gravity="center"
        android:layout_marginTop="8dp"
        android:textSize="30sp"
        />
<!--share-->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/share"
        android:padding="8dp"
        android:orientation="horizontal">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/share"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:text="Share App"
            android:textColor="@color/white"
            android:textSize="20sp"
            />
    </LinearLayout>

<!--update-->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/update"
        android:padding="8dp"
        android:orientation="horizontal">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/update"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:text="Update App"
            android:textColor="@color/white"
            android:textSize="20sp"
            />
    </LinearLayout>

<!--rate-->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/rate"
        android:padding="8dp"
        android:orientation="horizontal">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/rate">

        </ImageView>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:text="Rate App"
            android:textColor="@color/white"
            android:textSize="20sp">

        </TextView>
    </LinearLayout>

    <!--more-->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/more"
        android:padding="8dp"
        android:orientation="horizontal">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/more"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:text="More App"
            android:textColor="@color/white"
            android:textSize="20sp"
            />
    </LinearLayout>


<!--new activity-->
    <Button
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:textColor="#ff0000"
        android:textSize="20sp"
        android:id="@+id/gotosecond"
        android:backgroundTint="#fff000"
        android:text="Go To Second Activity"
        android:layout_marginBottom="10dp"
        android:layout_marginTop="10dp"
        />
</LinearLayout>

====================================================================

Step 4: Copy and paste your Icon (drawable)

=================================================================

Step 5: Open res -> values -> themes -> theme and add following code:
In this step we open an theme file and add the code :- 
<!-- Customize your theme here. -->
<style name="BottomSheetTheme" parent="Theme.Design.Light.BottomSheetDialog">
    <item name="bottomSheetStyle" >@style/BottomSheetStyle</item>
</style>
<style name="BottomSheetStyle" parent="Widget.Design.BottomSheet.Modal">
    <item name="android:background">@android:color/transparent</item>
</style>

================================================================

Step 6: Open Java -> package – > MainActivity.Java and add following code:
In this step we open an Java file and add the code :-


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

==========================================================================================

Output: Now run the App and you will see main topics and sub-topics listed..... 


==============================================================================================
android bottom sheet dialog, android bottom sheet, android bottom sheet dialog fragment,
bottom sheet dialog android, Implementing Bottom Sheet Dialogs using Android Studio,
How to use Bottom  Sheet dialog in Android?, How to call bottom sheet in android?,
Bottom Sheet Dialog Android Studio Java Example Tutorial,
bottom sheet dialog animation android, modal bottom sheet dialog android,
