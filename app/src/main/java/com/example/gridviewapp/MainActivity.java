package com.example.gridviewapp;

import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridView = findViewById(R.id.gridview);

        //data to be displayed
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("The Complete Android 12 Course", R.drawable.icon1));
        courseModelArrayList.add(new CourseModel("The Complete Java Developer Course", R.drawable.icon2));
        courseModelArrayList.add(new CourseModel("The Complete Kotlin Course", R.drawable.icon3));
        courseModelArrayList.add(new CourseModel("The Complete Data Structure and Algorithms Course", R.drawable.icon4));

        //attach adapter
        MyAdapter myAdapter = new MyAdapter(this,courseModelArrayList);
        mGridView.setAdapter(myAdapter);

    }
}