package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button OkButton;
    EditText et_number1;
    EditText et_number2;
    String number1;
    String number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        OkButton = (Button) findViewById(R.id.ok_btn);
        et_number1 = (EditText) findViewById(R.id.ac1pt1);
        et_number2 = (EditText) findViewById(R.id.ac1pt2);
        number1 = et_number1.getText().toString();
        number2 = et_number2.getText().toString();

        OkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;


                LayoutInflater li = getLayoutInflater();

                View layout = li.inflate(R.layout.customt_toast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();


                number1 = et_number1.getText().toString();
                number2 = et_number2.getText().toString();
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("EXTRAN1",number1);
                intent.putExtra("EXTRAN2",number2);
                startActivity(intent);
            }
        });
    }
}