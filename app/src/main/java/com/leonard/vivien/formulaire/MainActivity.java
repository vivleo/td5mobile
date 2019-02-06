package com.leonard.vivien.formulaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register=findViewById(R.id.button);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText username=findViewById(R.id.pseudo);
        EditText mail=findViewById(R.id.mail);
        EditText phone=findViewById(R.id.phone);
        EditText password=findViewById(R.id.password);
        if (username!=null && mail!=null && phone!=null && password!=null){
            String user=username.getText().toString();
            String email=mail.getText().toString();
            String sPhone=phone.getText().toString();
            String pass=password.getText().toString();
            String info = user + email + sPhone + pass + pass;

        }
    }
}
