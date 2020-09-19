package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView t;
    EditText number1,number2;
     double n1,n2,result;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.t);
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);

        b1=findViewById(R.id.b1);

        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,result.class);
        if(v.getId()==R.id.b1){
        n1=Double.parseDouble(number1.getText().toString());
        n2=Double.parseDouble(number2.getText().toString());
        result=n1+n2;
        //t.setText(String.valueOf(result));
        intent.putExtra("Value",String.valueOf(result));
        startActivity(intent);
             }


     if(v.getId()==R.id.b2){
        n1=Double.parseDouble(number1.getText().toString());
        n2=Double.parseDouble(number2.getText().toString());
        result=n1-n2;
         intent.putExtra("Value",String.valueOf(result));
         startActivity(intent);

         //t.setText(String.valueOf(result));
         }


        if(v.getId()==R.id.b3){
            n1=Double.parseDouble(number1.getText().toString());
            n2=Double.parseDouble(number2.getText().toString());
            result=n1*n2;
           // t.setText(String.valueOf(result));

            intent.putExtra("Value",String.valueOf(result));
            startActivity(intent);

        }





        if(v.getId()==R.id.b4){
            n1=Double.parseDouble(number1.getText().toString());
            n2=Double.parseDouble(number2.getText().toString());
            result=n1/n2;

            intent.putExtra("Value",String.valueOf(result));
            startActivity(intent);


        }










    }


}
