package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private final String correctEmail = "pupkin@mail.ru";
    private final String correctPassword = "qwerty123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialButton signInButton = findViewById(R.id.btnSignin);
        TextInputEditText email = findViewById(R.id.et_Email);
        TextInputEditText password = findViewById(R.id.et_Password);
        TextView textView = findViewById(R.id.textView2);

        signInButton.setOnClickListener(v -> {
            if (email.getText().toString().equals(correctEmail) && password.getText().toString().equals(correctPassword)){
                textView.setTextColor(getColor(R.color.correct));
                textView.setText(getString(R.string.tvText2Correct));
            } else{
                textView.setTextColor(getColor(R.color.error));
                textView.setText(getString(R.string.tvText3Incorrect));
            }
            email.setText("");
            password.setText("");
        });
    }
}