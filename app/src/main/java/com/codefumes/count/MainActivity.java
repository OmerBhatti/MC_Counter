package com.codefumes.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView valtxt = findViewById(R.id.val);
        Button incbtn = findViewById(R.id.inc);
        Button decbtn = findViewById(R.id.dec);
        Button resetbtn = findViewById(R.id.reset);

        incbtn.setOnClickListener(view -> {
            count++;
            valtxt.setText(Integer.toString(count));
        });

        decbtn.setOnClickListener(view -> {
            if (count > 0) {
                count--;
                valtxt.setText(Integer.toString(count));
            }
            else{
                Toast.makeText(this,"Counter is already Zero!",Toast.LENGTH_SHORT).show();
            }
        });

        resetbtn.setOnClickListener(view -> {
            count = 0;
            valtxt.setText(Integer.toString(count));
        });
    }
}