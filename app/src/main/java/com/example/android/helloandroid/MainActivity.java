package com.example.android.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPageSelfDrivingCourse(View view) {
        //This method is used for opening a web page when the button "Apply now" is clicked.
        Uri uri = Uri.parse("https://www.udacity.com/course/intro-to-self-driving-cars--nd113");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openPageUdacityHomePage(View view) {
        //This method is used for opening a web page when the icon "Udacity" is clicked.
        Uri uri = Uri.parse("https://www.udacity.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
