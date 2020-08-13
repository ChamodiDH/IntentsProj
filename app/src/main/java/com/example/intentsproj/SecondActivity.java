package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    String no1;
    String no2;

    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    TextView answer;
    EditText ed_number1;
    EditText ed_number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.division);
        answer = (TextView) findViewById(R.id.actv3);

        Intent i = getIntent();
        no1= i.getStringExtra("EXTRAN1");
        no2= i.getStringExtra("EXTRAN2");

         ed_number1 = (EditText ) findViewById(R.id.PT1A2);
         ed_number2 = (EditText) findViewById(R.id.PT2A2);

        ed_number1.setText(no1);
        ed_number2.setText(no2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addition();
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                substraction();
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplication();
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });




}

    public void addition(){
        double n1 = Double.parseDouble(ed_number1.getText().toString());
        double n2 = Double.parseDouble(ed_number2.getText().toString());
        double result = n1 +n2;
        String r = Double.toString(result);
        answer.setText(r);
    }

    public void substraction(){
        double n1 = Double.parseDouble(ed_number1.getText().toString());
        double n2 = Double.parseDouble(ed_number2.getText().toString());
        double result = n1 - n2;
        String r = Double.toString(result);
        answer.setText(r);
    }

    public void multiplication(){
        double n1 = Double.parseDouble(ed_number1.getText().toString());
        double n2 = Double.parseDouble(ed_number2.getText().toString());
        double result = n1 * n2;
        String r = Double.toString(result);
        answer.setText(r);
    }

    public void division(){
        double n1 = Double.parseDouble(ed_number1.getText().toString());
        double n2 = Double.parseDouble(ed_number2.getText().toString());
        double result = n1/n2;
        String r = Double.toString(result);
        answer.setText(r);
    }
}