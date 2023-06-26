package com.example.panchayat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class problem_page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);

        EditText pnamet=findViewById(R.id.pnamet);
        EditText pment=findViewById(R.id.pment);
        Button rbutn =findViewById(R.id.rbutn);
        rbutn.setOnClickListener(view -> {
            String text=pment.getText().toString();
            if(text.isEmpty()){
                showAlertDialogue("please enter your problem");
            }
            else {
                showAlertDialogue("your request is submitted,Thank you ! :");
            }


        });
    }

    public void showAlertDialogue (String msg){
        AlertDialog dialog=new AlertDialog.Builder(problem_page.this)
                .setTitle("E Panchayat System ")
                .setMessage(msg)
                .setCancelable(false)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).create();
        dialog.show();
    }


}