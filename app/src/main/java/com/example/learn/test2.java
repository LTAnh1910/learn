package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class test2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2);


        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);

        TextView input_a = findViewById(R.id.input_a);
        TextView input_b = findViewById(R.id.input_b);
        TextView input_c = findViewById(R.id.input_c);

        TextView setView = findViewById(R.id.setView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_a.setText("");
                input_b.setText("");
                input_c.setText("");
                input_a.requestFocus();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input_a.getText().toString());
                int b = Integer.parseInt(input_b.getText().toString());
                int c = Integer.parseInt(input_c.getText().toString());

                double delta = b * b - 4 * a * c;

                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    setView.setText("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + " và x2 = " + x2);
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    setView.setText("Phương trình có nghiệm kép: x1 = x2 = " + x);
                } else {
                    setView.setText("Phương trình vô nghiệm");
                }
            }
        });
    }
}