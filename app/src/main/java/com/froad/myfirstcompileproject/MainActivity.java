package com.froad.myfirstcompileproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.froad.mylib.MyTest;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTest myTest = new MyTest();
        double d = myTest.addition(1,2);
        Log.d(TAG, "onCreate>>>d:" + d);
    }
}
