package com.pharos.dzbb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText EditText_Email , EditText_Password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText_Email = findViewById(R.id.Email);
        EditText_Password = findViewById(R.id.Password);
        button = findViewById(R.id.buttom);

       EditText_Email.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void afterTextChanged(Editable editable) {

               if (!EditText_Email.getText().toString().isEmpty() && !EditText_Password.getText().toString().isEmpty()){
                   button.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.ser));
               }
               else {
                   button.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.ginger));
               }
           }
       });



    }



}