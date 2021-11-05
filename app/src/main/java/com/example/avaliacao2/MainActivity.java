package com.example.avaliacao2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btntoast,btnactivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntoast=findViewById(R.id.btntoast);
        btnactivity=findViewById(R.id.btnactivity);
        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Este é o botão 1",Toast.LENGTH_LONG).show();
            }
        });
        btnactivity.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Tela2.class);
                startActivity(it);
                finish();
            }
        }));
    }
}