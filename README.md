#ModelBottomSheetDialog
Step 1: Creating a new project

    Open a new project.

    We will be working on Empty Activity with language as Java. Leave all other options unchanged.

    You can change the name of the project at your convenience.

    There will be two default files named activity_main.xml and MainActivity.java.

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
