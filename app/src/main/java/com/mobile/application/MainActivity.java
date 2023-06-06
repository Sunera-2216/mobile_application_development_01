package com.mobile.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text1 = findViewById(R.id.text1);
        EditText text2 = findViewById(R.id.text2);
        Button sum = findViewById(R.id.sum);
        Button sub = findViewById(R.id.sub);
        Button div = findViewById(R.id.div);
        Button mul = findViewById(R.id.mul);
        TextView answer = findViewById(R.id.answer);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());

                int ans = num1 + num2;

                answer.setText(String.valueOf(ans));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());

                int ans = num1 - num2;

                answer.setText(String.valueOf(ans));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());

                int ans = num1 / num2;

                answer.setText(String.valueOf(ans));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());

                int ans = num1 * num2;

                answer.setText(String.valueOf(ans));
            }
        });
    }
}