package com.example.panchayat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class user_page extends AppCompatActivity {
    TextView marquee_text;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        Button btn3 = findViewById(R.id.registerbtn);
        Button btn6=findViewById(R.id.applybtn);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //Intent myInt = new Intent(user_page.this, problem_page.class);
                Intent myInt = new Intent(user_page.this, form_page.class);

               user_page.this.startActivity(myInt);
            }
    });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt=new Intent(user_page.this,userapply.class);
                user_page.this.startActivity(myInt);
            }
        });

        marquee_text=findViewById(R.id.marquee_text);
        marquee_text.setSelected(true);
}
}