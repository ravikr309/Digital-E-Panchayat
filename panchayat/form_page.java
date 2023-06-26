package com.example.panchayat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class form_page extends AppCompatActivity {
   /* EditText pname,problem,utext;
    Button rbtn;
    DBHelper DB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_page);

        pname=findViewById(R.id.pname);
        problem=findViewById(R.id.problem);
        utext=findViewById(R.id.utext);

        rbtn=findViewById(R.id.rbtn);
        DB=new DBHelper(this);

        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String nameTXT=pname.getText().toString();
               String problemTXT=problem.getText().toString();
               String problmmTXT=utext.getText().toString();

               Boolean checkinsertdata =DB.insertuserdata(nameTXT,problemTXT,problmmTXT);
               if(checkinsertdata==true)
                   Toast.makeText(form_page.this,"registered",Toast.LENGTH_SHORT).show();
               else
                   Toast.makeText(form_page.this,"not registered",Toast.LENGTH_SHORT).show();
            }
        });
    }

    */
    private EditText pname;
    private EditText problem;
    private EditText utext;
    private Button rbtn;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_page);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();


        pname = findViewById(R.id.pname);
        problem = findViewById(R.id.problem);
        utext = findViewById(R.id.utext);

        rbtn = findViewById(R.id.rbtn);

        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getpname = pname.getText().toString();
                String getproblem = problem.getText().toString();
                String getutext = utext.getText().toString();

                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("pname", getpname);
                hashMap.put("problem", getproblem);
                hashMap.put("utext", getutext);

                databaseReference.child("Users")
                        .child(getpname)
                        .setValue(hashMap)
                        /*.addOnCompleteListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void avoid) {
                                Toast.makeText(form_page.this, "Data added", Toast.LENGTH_SHORT).show();
                            }
                        })*/
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(form_page.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }

        });

    }
}