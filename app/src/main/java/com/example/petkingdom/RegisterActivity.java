package com.example.petkingdom;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    EditText e, p;
    FirebaseAuth mAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        e = (EditText) findViewById(R.id.emailboxS);
        p = (EditText) findViewById(R.id.passboxS);
        mAuth = FirebaseAuth.getInstance();
    }

    public void createUser (View v) {
        if(e.getText().toString().equals("") && p.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),"Blank not allowed", Toast.LENGTH_SHORT).show();
        } else {
            String email = e.getText().toString();
            String password = p.getText().toString();
            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(getApplicationContext(),"User created succesfully",Toast.LENGTH_SHORT).show();
                                finish();
                                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                                startActivity(i);
                            } else {
                                Toast.makeText(getApplicationContext(), "User could not be found",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }

    public void openLogin(View v) {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }
}
