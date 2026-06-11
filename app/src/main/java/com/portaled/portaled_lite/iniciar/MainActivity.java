package com.portaled.portaled_lite.iniciar;
import com.portaled.portaled_lite.cadrastro.EsqueceuSenhaActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.portaled.portaled_lite.R;
import com.portaled.portaled_lite.cadrastro.CadastroActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnEntrar;
    private TextView txtCriarConta;
    private TextView txtEsqueciSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnEntrar = findViewById(R.id.btnEntrar);
        txtEsqueciSenha = findViewById(R.id.txtEsqueciSenha);
        txtCriarConta = findViewById(R.id.txtCriarConta);

        btnEntrar.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            HomeActivity.class);

            startActivity(intent);
        });

        txtCriarConta.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            CadastroActivity.class);

            startActivity(intent);
        });

        txtEsqueciSenha.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            EsqueceuSenhaActivity.class
                    );

            startActivity(intent);

        });
    }
}