package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
     TextView t1;
     String s;
     double d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setTitle("result");
        t1=findViewById(R.id.t1);
        s=getIntent().getExtras().getString("Value");
        //d=Double.parseDouble(s.toString());
        t1.setText(s);

    }
}