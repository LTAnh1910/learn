package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class bai4 extends AppCompatActivity {

    double tong_doan_thu=0;
    double tong_khach_hang=0;
    double tong_kh_vip=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test4);



        TextView name = findViewById(R.id.name);
        TextView book_count = findViewById(R.id.book_count);
        TextView tong_kh = findViewById(R.id.tong_kh);
        TextView kh_vip = findViewById(R.id.kh_vip);
        TextView tt2 = findViewById(R.id.tt2);
        TextView dt = findViewById(R.id.doanhthu);



        CheckBox check = findViewById(R.id.check);

        Button tt = findViewById(R.id.info);
        Button next = findViewById(R.id.next);
        Button tk = findViewById(R.id.tk);

        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int book = Integer.parseInt(book_count.getText().toString());
                if(check.isChecked()){
                        int sum =  (book * 20000) * 90/100;
                        tt2.setText(sum+"");
                        tong_kh_vip++;
                        tong_khach_hang++;
                        tong_doan_thu= sum++;

                }
                else{
                    int sum =  book * 20000;
                        tt2.setText(sum+"");
                        tong_doan_thu= sum++;
                        tong_khach_hang++;

                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                name.requestFocus();
                book_count.setText("");
                tt2.setText("");
            }
        });

        tk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    tong_kh.setText(tong_khach_hang +"");
                    kh_vip.setText(tong_kh_vip+"");
                    dt.setText(tong_doan_thu+"");



            }
        });


    }
}