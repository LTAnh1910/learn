package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class bai3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai3);

        TextView ht = findViewById(R.id.ho_ten);
        TextView cmnd = findViewById(R.id.cmnd);
        TextView tt  = findViewById(R.id.info);

        CheckBox tc = findViewById(R.id.checkTC);
        CheckBox cd = findViewById(R.id.checkCD);
        CheckBox dh = findViewById(R.id.checkDH);

        Button sg = findViewById(R.id.btnSugest);


        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int name = Integer.parseInt(ht.getText().toString());
                int cm = Integer.parseInt(cmnd.getText().toString());
                int info  = Integer.parseInt(tt.getText().toString());

                            
            }


        });





    }
}