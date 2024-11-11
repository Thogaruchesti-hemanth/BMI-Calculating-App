package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextWeight, editTextHeight;

    TextView textViewResult;

    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextHeight=findViewById(R.id.EditTextHeight);
        editTextWeight = findViewById(R.id.EditTextWeight);
        textViewResult = findViewById(R.id.textViewResult);
        buttonCalculate =findViewById(R.id.buttonCalculate);


        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double weight= Double.parseDouble(editTextWeight.getText().toString());
                double height= Double.parseDouble(editTextHeight.getText().toString());

                if(weight==0||height==0){
                    Toast.makeText(MainActivity.this,"Please Enter all the Values",Toast.LENGTH_SHORT).show();
                    return;
                }

                double result = weight/(height*height);

                textViewResult.setText("Your BMI .2%f is: "+String.valueOf(result));

                editTextWeight.setText("");
                editTextHeight.setText("");

            }
        });

    }
}