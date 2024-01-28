package com.example.petkingdom;

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

public class LoginActivity extends AppCompatActivity {

    EditText email, pass;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        email = (EditText) findViewById(R.id.emailbox);
        pass = (EditText) findViewById(R.id.passbox);
        mAuth = FirebaseAuth.getInstance();
    }
    public void openRegister(View v) {
        Intent i = new Intent(this,RegisterActivity.class);
        startActivity(i);
    }

    public void loginUser (View v) {
        if(email.getText().toString().equals("") && pass.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),"Blank not allowed", Toast.LENGTH_SHORT).show();
        } else {
            mAuth.signInWithEmailAndPassword(email.getText().toString(),pass.getText().toString())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(getApplicationContext(),"User logged in successfully",Toast.LENGTH_SHORT).show();
                                finish();
                                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(i);
                            } else {
                                Toast.makeText(getApplicationContext(),"User could not login",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }
}
