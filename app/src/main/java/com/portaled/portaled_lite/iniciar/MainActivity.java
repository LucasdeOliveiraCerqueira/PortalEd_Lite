package com.portaled.portaled_lite.iniciar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.portaled.portaled_lite.R;

public class MainActivity extends AppCompatActivity {

    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this, HomeActivity.class);

            startActivity(intent);

        });
    }
}